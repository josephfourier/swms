package com.thinkjoy.swms.common.annotation;

import java.lang.annotation.*;

/**
 * Created by wangcheng on 18/3/2.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SwmsRequiresPerms {
    String[] value();
}
