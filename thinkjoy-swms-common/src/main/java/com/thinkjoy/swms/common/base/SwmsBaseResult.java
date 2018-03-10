package com.thinkjoy.swms.common.base;

import com.thinkjoy.common.base.BaseResult;

/**
 * Created by wangcheng on 18/3/5.
 */
public class SwmsBaseResult extends BaseResult {

    public SwmsBaseResult(int code, String message, Object data) {
        super(code, message, data);
    }

    public SwmsBaseResult(SwmsResultConstant swmsResultConstant, Object data) {
        super(swmsResultConstant.getCode(), swmsResultConstant.getMessage(), data);
    }

    public SwmsBaseResult(SwmsResultConstant swmsResultConstant, String message, Object data) {
        super(swmsResultConstant.getCode(), message, data);
    }
}
