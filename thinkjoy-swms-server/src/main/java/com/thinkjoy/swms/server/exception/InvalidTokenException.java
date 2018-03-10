package com.thinkjoy.swms.server.exception;

import com.thinkjoy.swms.common.base.SwmsResultConstant;
import com.thinkjoy.swms.common.exception.BaseException;

/**
 * Created by wangcheng on 18/3/5.
 */
public class InvalidTokenException extends BaseException {
    public InvalidTokenException(int code, String message) {
        super(code, message);
    }

    public InvalidTokenException(SwmsResultConstant swmsResultConstant) {
        super(swmsResultConstant);
    }
}
