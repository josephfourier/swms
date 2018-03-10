//package com.thinkjoy.swms.common.mybatis;
//
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.*;
//import com.baomidou.mybatisplus.generator.config.rules.DbType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import com.thinkjoy.common.util.JdbcUtil;
//import com.thinkjoy.common.util.PropertiesFileUtil;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//
//import java.io.File;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
///**
// * mybatis-plus代码生成器
// * <p/>
// * ┏┓      ┏┓
// * ┏┛┻━━━━━━┛┻┓
// * ┃ 　       ┃
// * ┃　　  ━　　 ┃
// * ┃　┳┛　  ┗┳ ┃
// * ┃　　　　　　┃
// * ┃　　　┻　　 ┃
// * ┃　　　　　　┃
// * ┗━┓　　　┏━┛
// * 　　┃　　　┃神兽保佑
// * 　　┃　　　┃代码无BUG！
// * 　　┃　　　┗━━━┓
// * 　　┃　　　　　　┣┓
// * 　　┃　　　　　　┏┛
// * 　　┗┓ ┓┏━┳┓┏┛
// * 　　　┃┫┫　┃┫┫
// * 　　　┗┻┛　┗┻┛
// *
// * @author wangcheng
// * @date 18/2/11
// */
//public class MPCodeGen {
//
//    private static final Log log = LogFactory.getLog(MPCodeGen.class);
//
//
//    private static String AUTHOR_NAME = "Miracle.wang";     //作者
//
//    // 根据命名规范，按需修改
//    private static String PROJECT_NAME = "thinkjoy-swms";// 项目名称
//    private static String DATABASE = "zjy-swms";//数据库
//    private static String TABLE_PREFIX = "swms_";//要生成表的前缀
//    private static String BASE_PACKAGE_NAME = "com.thinkjoy.swms";//所有模块的公有包路径
//
//    private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
//    private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
//    private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
//    private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");
//    // 获取需要生成的表名称,
//    private static List<String> tables = new ArrayList<String>();
//
//    static {
//        try {
//            //可以自己写sql查询特定的表
//            String sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = '" + DATABASE + "' AND table_name LIKE '" + TABLE_PREFIX + "" + "%';";
//            //String sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = 'zjy' AND table_name in ('ams_approle')";
//
//            JdbcUtil jdbcUtil = new JdbcUtil(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
//            List<Map> result = jdbcUtil.selectByParams(sql, null);
//            for (Map map : result) {
//                log.info("需要生成的表--->" + map.get("TABLE_NAME"));
//                tables.add((String) map.get("TABLE_NAME"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    /**
//     * 自动代码生成
//     *
//     * @param args
//     */
//    public static void main(String[] args) throws Exception {
//        gen();
//    }
//
//    public static void gen() {
//        String subModule = PROJECT_NAME + "-common";
//        String basePath = MPCodeGen.class.getResource("/").getPath().replace("/target/classes/", "").replace(subModule, "");
//        String[] modules = {"%s-dao", "%s-rpc-api", "%s-rpc-service", "%s-server"};
//
//        for (String m : modules) {
//            String moduleName = String.format(m, PROJECT_NAME);
//
//            doGen(moduleName, basePath + moduleName, TABLE_PREFIX, BASE_PACKAGE_NAME);
//        }
//
//    }
//
//
//    public static void doGen(
//            String module,
//            String outPath,
//            String table_prefix,
//            String base_package_name
//    ) {
//        //全局配置
//        GlobalConfig globalConfig = new GlobalConfig()
//                .setOutputDir(outPath + "/src/main/java")//输出目录
//                .setFileOverride(true)// 是否覆盖文件
//                .setActiveRecord(true)// 开启 activeRecord 模式
//                .setEnableCache(true)// XML 二级缓存
//                .setBaseResultMap(true)// XML ResultMap
//                .setBaseColumnList(true)// XML columList
//                .setOpen(false)//生成后打开文件夹
//                .setAuthor(AUTHOR_NAME)
//                // 自定义文件命名，注意 %s 会自动填充表实体属性！
//                .setMapperName("%sMapper")
//                .setXmlName("%sMapper")
//                .setServiceName("%sService")
//                .setServiceImplName("%sServiceImpl")
//                .setControllerName("%sController");
//
//
//        // 数据源配置
//        DataSourceConfig dataSourceConfig = new DataSourceConfig()
//                .setDbType(DbType.MYSQL)// 数据库类型
//                .setDriverName(JDBC_DRIVER)// 数据驱动,统一配置
//                .setUsername(JDBC_USERNAME)
//                .setPassword(JDBC_PASSWORD)
//                .setUrl(JDBC_URL);
//
//
//        // 策略配置
//        StrategyConfig strategyConfig = new StrategyConfig()
//                // .setCapitalMode(true)// 全局大写命名
//                //.setDbColumnUnderline(true)//全局下划线命名
//                .setTablePrefix(new String[]{table_prefix})// 此处可以修改为您的表前缀
//                .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
//                .setInclude(tables.toArray(new String[tables.size()])) // 需要生成的表,数据库中的表生成相应代码
//                .setRestControllerStyle(true)
//        //.setExclude(new String[]{"test"}) // 排除生成的表
//        // 自定义实体父类
//         .setSuperEntityClass(BASE_PACKAGE_NAME+".common.base.SuperEntity")
//        // 自定义实体，公共字段
//        //.setSuperEntityColumns(new String[]{"test_id"})
//        //.setTableFillList(tableFillList)
//        // 自定义 mapper 父类
//         .setSuperMapperClass(BASE_PACKAGE_NAME+".common.base.SuperMapper")
//        // 自定义 service 父类
//         .setSuperServiceClass(BASE_PACKAGE_NAME+".common.base.SuperService")
//        // 自定义 service 实现类父类
//         .setSuperServiceImplClass(BASE_PACKAGE_NAME+".common.base.SuperServiceImpl")
//        // 自定义 controller 父类
//        .setSuperControllerClass(BASE_PACKAGE_NAME+".common.base.SuperController")
//        // 【实体】是否生成字段常量（默认 false）
//        // public static final String ID = "test_id";
//        // .setEntityColumnConstant(true)
//        // 【实体】是否为构建者模型（默认 false）
//        // public User setName(String name) {this.name = name; return this;}
//        // .setEntityBuilderModel(true)
////         【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
//         .setEntityLombokModel(true)
//        // Boolean类型字段是否移除is前缀处理
//        // .setEntityBooleanColumnRemoveIsPrefix(true)
//         .setRestControllerStyle(true)
//         .setControllerMappingHyphenStyle(true);
//
//
//        // 包配置
//        PackageConfig packageConfig = new PackageConfig()
//                //.setModuleName("User")
//                .setParent(base_package_name)// 自定义包路径
//                .setController("server.controller")// 这里是控制器包名，默认 web
//                .setEntity("dao.entity")
//                .setMapper("dao.mapper")
//                .setService("rpc.api")
//                .setServiceImpl("rpc.service.impl")
//                .setXml("rpc.mapper");
//
//
//        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
////        InjectionConfig abc = new InjectionConfig() {
////            @Override
////            public void initMap() {
////                Map<String, Object> map = new HashMap<>();
////                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
////                this.setMap(map);
////            }
////        }.setFileOutConfigList(Collections.<FileOutConfig>singletonList(new FileOutConfig("/templates/mapper.xml.vm") {
////            // 自定义输出文件目录
////            @Override
////            public String outputFile(TableInfo tableInfo) {
////                return path + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper.xml";
////            }
////        }));
//
//
//        // 多模块
//        TemplateConfig tc = getTemplateConfig(globalConfig, packageConfig, module, false);
//
//        // 关闭默认 xml 生成，调整生成 至 根目录
//        //new TemplateConfig()
//        // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy
//        // 至您项目 src/main/resources/template 目录下，模板名称也可自定义如下配置：
//        // .setController("...");
//        // .setEntity("...");
//        // .setMapper("...");
//        // .setXml("...");
//        // .setService("...");
//        // .setServiceImpl("...");
//
//        if (tc.getMapper() == null && tc.getXml() == null && tc.getService() == null &&
//                tc.getServiceImpl() == null && tc.getController() == null && tc.getEntity(false) == null) {
//            return;
//        }
//
//        // 代码生成器
//        AutoGenerator autoGenerator = new AutoGenerator();
//        autoGenerator.setGlobalConfig(globalConfig);
//        autoGenerator.setDataSource(dataSourceConfig);
//        autoGenerator.setStrategy(strategyConfig);
//        autoGenerator.setPackageInfo(packageConfig);
//        //autoGenerator.setCfg(abc);
//        autoGenerator.setTemplate(tc);
//
//        // 执行生成
//        autoGenerator.execute();
//    }
//
//    /**
//     * 控制包生成的路径与是否覆盖生成
//     *
//     * @param gc      // 全局配置
//     * @param pc      包配置
//     * @param model   model名
//     * @param isCover 是否覆盖生成代码
//     * @return TemplateConfig
//     */
//    private static TemplateConfig getTemplateConfig(GlobalConfig gc, PackageConfig pc, String model, boolean isCover) {
//        TemplateConfig tc = new TemplateConfig();
//        String entity = "123";
//        String path = model + "/src/main/java/" + replace(pc.getParent());
//        if (!isCover) {
//            if ((PROJECT_NAME + "-dao").equals(model)) {
//                //实体
//                String modelPath = path + "/" + replace(pc.getEntity()) + "/" + entity + ".java";
//                if (isExists(modelPath)) {
//                    tc.setEntity(null);
//                    log.info(entity + ".java 文件已存在");
//                }
//                //mapper接口
//                String mapperPath = path + "/" + replace(pc.getMapper()) + "/" + gc.getMapperName().replace("%s", entity) + ".java";
//                if (isExists(mapperPath)) {
//                    tc.setMapper(null);
//                    log.info(gc.getMapperName().replace("%s", entity) + ".java 文件已存在");
//                }
//
//                tc.setController(null);
//                tc.setXml(null);
//                tc.setService(null);
//                tc.setServiceImpl(null);
//            } else if ((PROJECT_NAME + "-rpc-api").equals(model)) {
//
//                String servicePath = path + "/" + replace(pc.getService()) + "/" + gc.getServiceName().replace("%s", entity) + ".java";
//                if (isExists(servicePath)) {
//                    tc.setService(null);
//                    log.info(gc.getServiceName().replace("%s", entity) + ".java 文件已存在");
//                }
//                tc.setController(null);
//                tc.setServiceImpl(null);
//                tc.setMapper(null);
//                tc.setXml(null);
//                tc.setEntity(null);
//            } else if ((PROJECT_NAME + "-rpc-service").equals(model)) {
//
//                String serviceImplPath = path + "/" + replace(pc.getServiceImpl()) + "/" + gc.getServiceImplName().replace("%s", entity) + ".java";
//                if (isExists(serviceImplPath)) {
//                    tc.setServiceImpl(null);
//                    log.info(gc.getServiceImplName().replace("%s", entity) + ".java 文件已存在");
//                }
//
//                String mapperXmlPath = path + "/" + replace(pc.getXml()) + "/" + gc.getXmlName().replace("%s", entity) + ".xml";
//                if (isExists(mapperXmlPath)) {
//                    tc.setXml(null);
//                    log.info(gc.getXmlName().replace("%s", entity) + ".xml 文件已存在");
//                }
//                tc.setController(null);
//                tc.setService(null);
//                tc.setMapper(null);
//                tc.setEntity(null);
//            } else if ((PROJECT_NAME + "-server").equals(model)) {
//                String controllerPath = path + "/" + replace(pc.getController()) + "/" + gc.getControllerName().replace("%s", entity) + ".java";
//                ;
//                if (isExists(controllerPath)) {
//                    tc.setController(null);
//                    log.info(gc.getControllerName().replace("%s", entity) + ".java 文件已存在");
//                }
//                tc.setMapper(null);
//                tc.setXml(null);
//                tc.setService(null);
//                tc.setServiceImpl(null);
//                tc.setEntity(null);
//            }
//        } else {
//            if ((PROJECT_NAME + "-dao").equals(model)) {
//                tc.setController(null);
//                tc.setXml(null);
//                tc.setService(null);
//                tc.setServiceImpl(null);
//            } else if ((PROJECT_NAME + "-rpc-api").equals(model)) {
//                tc.setController(null);
//                tc.setServiceImpl(null);
//                tc.setMapper(null);
//                tc.setXml(null);
//                tc.setEntity(null);
//            } else if ((PROJECT_NAME + "-rpc-service").equals(model)) {
//                tc.setController(null);
//                tc.setService(null);
//                tc.setMapper(null);
//                tc.setEntity(null);
//            } else if ((PROJECT_NAME + "-server").equals(model)) {
//                tc.setMapper(null);
//                tc.setXml(null);
//                tc.setService(null);
//                tc.setServiceImpl(null);
//                tc.setEntity(null);
//            }
//        }
//        return tc;
//    }
//
//    /**
//     * 判断文件是否存在
//     *
//     * @param path 路径
//     * @return
//     */
//    private static boolean isExists(String path) {
//        File file = new File(path);
//        return file.exists();
//    }
//
//    /**
//     * 将点替换为斜杠
//     *
//     * @param name
//     * @return
//     */
//    private static String replace(String name) {
//        return name.replace(".", "/");
//    }
//}
