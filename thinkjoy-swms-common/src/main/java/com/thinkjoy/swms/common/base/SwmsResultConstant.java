package com.thinkjoy.swms.common.base;

/**
 * 学工返回的数据结构
 *
 * @author wangcheng
 * @date 18/3/1
 */
public enum SwmsResultConstant{
    FAILED(0, "failed"),
    SUCCESS(1, "success"),

    FILE_TYPE_ERROR(20001, "File type not supported!"),
    INVALID_LENGTH(20002, "Invalid length"),
    INVALID_PARAMETER(20003, "Invalid parameter"),
    NULL_ERROR(20004, "Not Null!"),

    /**
     * code 3XXXX
     */

    NO_AUTH(30001, "没有该接口权限!"),
    INVALID_TOKEN(30002, "无效的token!");

    public int code;
    public String message;

    SwmsResultConstant(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
