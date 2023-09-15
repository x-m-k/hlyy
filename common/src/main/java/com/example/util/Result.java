package com.example.util;



/**
 * 响应结果
 */

public final class Result<T> {

    public static final String SUCCESS_MSG = "成功";
    public static final String FAILED_MSG = "失败";


    private String message; //响应消息

    private Integer code;   //响应编码

    private T data;         //响应数据

    public Result() {

    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功
     *
     * @return
     */
    public static Result success() {
        return new Result(200, SUCCESS_MSG);
    }

    public static Result success(Object data) {
        return new Result(200, SUCCESS_MSG, data);
    }

    public static Result success(Integer code, String message, Object data) {
        return new Result(code, message, data);
    }

    /**
     * 失败
     *
     * @return
     */
    public static Result failed() {
        return new Result(300, FAILED_MSG);
    }

    public static Result failed(Object data) {
        return new Result(300, FAILED_MSG, data);
    }

    public static Result failed(Integer code, String message, Object data) {
        return new Result(code, message, data);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
