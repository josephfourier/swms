//package com.thinkjoy.swms.common.base;
//
//import com.baomidou.mybatisplus.activerecord.Model;
//
//import java.io.Serializable;
//
///**
// * 实体基类
// *
// * @author wangcheng
// * @date 18/2/11
// */
//public class SuperEntity<T extends Model> extends Model<T> {
//
//    private String id;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    @Override
//    protected Serializable pkVal() {
//        return this.id;
//    }
//}
