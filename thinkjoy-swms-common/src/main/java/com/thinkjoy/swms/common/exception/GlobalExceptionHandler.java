//package com.thinkjoy.exception;
//
//import com.thinkjoy.swms.common.base.BaseConstants;
//import com.thinkjoy.swms.common.base.BaseResult;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @author wangcheng
// * @date 18/2/8
// * 统一异常处理
// */
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(value = RuntimeException.class)
//    @ResponseBody
//    public BaseResult defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//        BaseResult baseResult = new BaseResult();
//        baseResult.setCode(BaseConstants.ResultCode.ERROR);
//        baseResult.setMessage(e.getMessage());
//        baseResult.setData("");
//        return baseResult;
//    }
//}
