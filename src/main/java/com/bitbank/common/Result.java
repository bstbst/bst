package com.bitbank.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by bst on 2019/1/4.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Result<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    /**
     * @param status
     */
    private Result(int status) {
        this.status = status;
    }

    /**
     * @param status
     * @param data
     */
    private Result(int status, T data) {
        this.status = status;
        this.data = data;
    }

    /**
     * @param status
     * @param data
     * @param msg
     */
    private Result(int status, T data, String msg) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    /**
     * @param status
     * @param msg
     */
    private Result(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    /**
     * @return
     */
    @JsonIgnore
    public boolean isSuccess() {
        return this.status == ResultCode.SUCCESS.getCode();
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public static <T> Result<T> crateBySuccessCode() {
        return new Result<T>(ResultCode.SUCCESS.getCode());
    }

    public static <T> Result<T> crateBySuccessMasge(String massge) {
        return new Result<T>(ResultCode.SUCCESS.getCode(), massge);
    }

    public static <T> Result<T> crateBySuccessData(T data) {
        return new Result<T>(ResultCode.SUCCESS.getCode(), data);
    }

    public static <T> Result<T> crateBySuccess(T data, String massge) {
        return new Result<T>(ResultCode.SUCCESS.getCode(), data, massge);
    }

    public static <T> Result<T> crateByError() {
        return new Result<T>(ResultCode.ERROR.getCode(), ResultCode.ERROR.getDesc());
    }

    public static <T> Result<T> crateByErrorMassge(String massge) {
        return new Result<T>(ResultCode.ERROR.getCode(), massge);
    }

    public static <T> Result<T> crateByErrorCodeMassge(int code, String massge) {
        return new Result<T>(code, massge);
    }
}
