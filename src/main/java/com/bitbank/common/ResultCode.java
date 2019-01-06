package com.bitbank.common;

/**
 * Created by bst on 2019/1/4.
 */
public enum ResultCode {
    SUCCESS(1, "SUCCESS"),
    ERROR(0, "ERROR");

    private final int code;
    private final String desc;

    ResultCode(int code, String desc) {
        this.code = code;
        this.desc = desc;

    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
