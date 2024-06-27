package com.zzh.utils;

import lombok.Getter;

@Getter
public enum ResultEnum {
    SUCCESS(200, "成功"),
    ERROR(500, "失败"),
    NOT_FOUND(404, "未找到"),
    BAD_REQUEST(400, "请求错误"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "禁止访问"),
    NOT_IMPLEMENTED(501, "未实现"),
    SERVICE_UNAVAILABLE(503, "服务不可用");

    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
    }
}
