package com.thinkjoy.swms.common.base;

/**
 * Created by wangcheng on 18/3/1.
 */
public class SwmsResult extends SwmsBaseResult {
    public SwmsResult(int code, String message, Object data) {
        super(code, message, data);
    }

    public SwmsResult(SwmsResultConstant swmsResultConstant, Object data) {
        super(swmsResultConstant, data);
    }

    public SwmsResult(SwmsResultConstant swmsResultConstant, String message, Object data) {
        super(swmsResultConstant, message, data);
    }


}
