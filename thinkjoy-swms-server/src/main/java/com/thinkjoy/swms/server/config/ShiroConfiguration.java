package com.thinkjoy.swms.server.config;

import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.ams.rpc.api.AmsAppService;
import com.thinkjoy.ams.rpc.api.AmsApppermissionService;
import com.thinkjoy.ams.rpc.api.AmsApproleService;
import com.thinkjoy.oauth.client.shiro.filter.OauthAuthenticationFilter;
import com.thinkjoy.oauth.client.shiro.filter.OauthSessionForceLogoutFilter;
import com.thinkjoy.oauth.client.shiro.listener.OauthSessionListener;
import com.thinkjoy.oauth.client.shiro.realm.OauthRealm;
import com.thinkjoy.oauth.client.shiro.session.OauthSessionDao;
import com.thinkjoy.oauth.client.shiro.session.OauthSessionFactory;
import com.thinkjoy.ucenter.rpc.api.UcenterApiService;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.apache.oltu.oauth2.as.issuer.UUIDValueGenerator;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.SessionListener;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.AuthenticationFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;

import javax.servlet.Filter;
import java.util.*;

/**
 * Created by wangcheng on 18/2/23.
 */
//@Configuration
//@Order(Ordered.HIGHEST_PRECEDENCE)
//@ImportResource(("classpath*:applicationContext-shiro.xml"))
public class ShiroConfiguration{

//    @Value("${thinkjoy.web.sso.server.url}")
//    private String loginUrl;
//    @Value("${thinkjoy.web.successUrl}")
//    private String successUrl;
//    @Value("${thinkjoy.web.unauthorizedUrl}")
//    private String unauthorizedUrl;
//
//    Environment environment;
//
//    @Bean
//    public ShiroFilterFactoryBean shirFilter() {
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        shiroFilterFactoryBean.setSecurityManager(securityManager());
//
//        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
//        //注意过滤器配置顺序 不能颠倒
//        //配置退出 过滤器,其中的具体的退出代码Shiro已经替我们实现了，登出后跳转配置的loginUrl
//        filterChainDefinitionMap.put("/manage/**", "authc");
//        filterChainDefinitionMap.put("/manage/index", "user");
//        filterChainDefinitionMap.put("/druid/**", "user");
//        filterChainDefinitionMap.put("/swagger-ui.html", "anon");
//        filterChainDefinitionMap.put("/logout", "anon");
//        filterChainDefinitionMap.put("/swagger-ui.html", "anon");
//        // 配置不会被拦截的链接 顺序判断
//        filterChainDefinitionMap.put("/resources/**", "anon");
//        filterChainDefinitionMap.put("/**", "anon");
//
//        //配置shiro默认登录界面地址，前后端分离中登录界面跳转应由前端路由控制，后台仅返回json数据
//        shiroFilterFactoryBean.setLoginUrl("http://localhost:1111");
//        // 登录成功后要跳转的链接
//       // shiroFilterFactoryBean.setSuccessUrl("index");
//        //未授权界面
//       // shiroFilterFactoryBean.setUnauthorizedUrl("/403");
//        OauthAuthenticationFilter oauthAuthenticationFilter = authenticationFilter();
//        Map<String,Filter> emptyMap = new HashMap<>();
//        emptyMap.put("authc",oauthAuthenticationFilter);
//        shiroFilterFactoryBean.setFilters(emptyMap);
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
//        return shiroFilterFactoryBean;
//    }
//
//
//    @Bean
//    public OauthSessionForceLogoutFilter logoutFilter() {
//        return new OauthSessionForceLogoutFilter();
//    }
//
//    @Bean
//    public OauthAuthenticationFilter authenticationFilter() {
//        return new OauthAuthenticationFilter();
//    }
//
//    @Bean
//    public OauthRealm myShiroRealm() {
//        return new MyOauthRealm();
//    }
//
//    @Override
//    public void setEnvironment(Environment environment) {
//        this.environment=environment;
//    }
//
//    class MyOauthRealm extends OauthRealm{
////        @Inject
////        private UcenterApiService ucenterApiService;
////        @Inject
////        private AmsApproleService amsApproleService;
////        @Inject
////        private AmsApppermissionService amsApppermissionService;
////        @Inject
////        private AmsAppService amsAppService;
//
//    }
//
//
//    @Bean
//    public OauthSessionDao sessionDao() {
//        return new OauthSessionDao();
//    }
//
//
//    @Bean
//    public SessionListener sessionListener() {
//        return new OauthSessionListener();
//    }
//
//    @Bean
//    public OauthSessionFactory sessionFactory() {
//        return new OauthSessionFactory();
//    }
//
//    @Bean
//    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
//        return new LifecycleBeanPostProcessor();
//    }
//
//
//    @Bean
//    public MethodInvokingFactoryBean invokingFactoryBean() {
//        MethodInvokingFactoryBean methodInvokingFactoryBean = new MethodInvokingFactoryBean();
//        methodInvokingFactoryBean.setStaticMethod("org.apache.shiro.SecurityUtils.setSecurityManager");
//        methodInvokingFactoryBean.setArguments(securityManager());
//        return methodInvokingFactoryBean;
//    }
//
//    @Bean
//    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
//        return new DefaultAdvisorAutoProxyCreator();
//    }
//
//    @Bean
//    public OAuthIssuerImpl oAuthIssuer() {
//        return new OAuthIssuerImpl(new UUIDValueGenerator());
//    }
//
//
//    @Bean
//    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() {
//        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
//        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager());
//        return authorizationAttributeSourceAdvisor;
//    }
//
//
//    @Bean
//    public SecurityManager securityManager() {
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        securityManager.setRealm(myShiroRealm());
//        // 自定义session管理 使用redis
//        securityManager.setSessionManager(sessionManager());
//        return securityManager;
//    }
//
//
//    @Bean("sessionManager")
//    @Primary
//    public DefaultWebSessionManager sessionManager() {
////        List<SessionListener> list = Collections.emptyList();
////        list.add(sessionListener());
//        SwmsWebSessionManager swmsWebSessionManager = new SwmsWebSessionManager();
//        swmsWebSessionManager.setSessionDAO(sessionDao());
//        swmsWebSessionManager.setSessionValidationSchedulerEnabled(false);
//        //swmsWebSessionManager.setSessionListeners(list);
//        swmsWebSessionManager.setSessionFactory(sessionFactory());
//        return swmsWebSessionManager;
//    }

}
