package com.thinkjoy.swms.common.exception;

import com.thinkjoy.swms.common.base.SwmsResultConstant;

/**
 * @author wangcheng
 * @date 18/3/5
 */
public class BaseException extends RuntimeException {
    protected int code;

    public BaseException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BaseException(SwmsResultConstant swmsResultConstant) {
        super(swmsResultConstant.getMessage());
        this.code = swmsResultConstant.getCode();
    }

    public int getCode() {
        return code;
    }
}
