package com.thinkjoy.swms.server.exception;

import com.thinkjoy.swms.common.base.SwmsResultConstant;
import com.thinkjoy.swms.common.exception.BaseException;

/**
 * @author wangcheng
 * @date 18/3/5
 */
public class NoAuthorityException extends BaseException {
    public NoAuthorityException(int code, String message) {
        super(code, message);
    }

    public NoAuthorityException(SwmsResultConstant swmsResultConstant) {
        super(swmsResultConstant);
    }
}
