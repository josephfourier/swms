package com.thinkjoy.swms.server.exception;

import com.thinkjoy.common.base.BaseConstants;
import com.thinkjoy.common.base.BaseResult;
import com.thinkjoy.swms.common.base.SwmsResult;
import com.thinkjoy.swms.common.base.SwmsResultConstant;
import com.thinkjoy.swms.common.exception.BaseException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wangcheng
 * @date 18/2/8
 * 统一异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public BaseResult defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        SwmsResult baseResult = null;
        if (e instanceof BaseException) {
            baseResult = new SwmsResult(((BaseException) e).getCode(), e.getMessage(), "");
        } else {
            baseResult = new SwmsResult(SwmsResultConstant.FAILED, e.getMessage(), "");
        }
        return baseResult;
    }
}
