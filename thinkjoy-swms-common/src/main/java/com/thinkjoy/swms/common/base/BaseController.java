package com.thinkjoy.swms.common.base;

import com.thinkjoy.common.base.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;

/**
 * 控制器基类
 *
 * @author wangcheng
 * @date 2017/2/4
 */
@Slf4j
public abstract class BaseController<T, S extends BaseService> {

    protected S getService() {
        return null;
    }

    /**
     * 获取使用注解时的错误信息提取
     *
     * @param result
     * @return
     */
    public HashMap getErrorMsg(BindingResult result) {
        List<FieldError> errors = result.getFieldErrors();
        StringBuilder strBuilder = new StringBuilder();
        for (FieldError err : errors) {
            strBuilder.append(err.getDefaultMessage()).append("<br/>");
        }

        HashMap<String, String> emap = new HashMap<>();
        emap.put("errorMsg", strBuilder.toString());
        return emap;
    }


    /**
     * 拼接错误信息
     *
     * @param
     * @return
     */
    public HashMap getErrorMsg(String errMsg) {
        HashMap<String, String> emap = new HashMap<>();
        emap.put("errorMsg", errMsg);
        return emap;
    }


//    @ModelAttribute("model")
//    public T getModel(
//            @PathVariable(value = "id", required = false) Integer id) {
//        if (id != null && getService() != null) {
//            try {
//                return (T) getService().selectByPrimaryKey(id);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }

}
