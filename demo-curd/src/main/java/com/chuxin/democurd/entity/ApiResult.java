package com.chuxin.democurd.entity;

public class ApiResult<T> {
    /**
     * 错误码，表示一种错误类型
     * 请求成功，状态码为200
     */
    private int code;
    /**
     * 对错误代码的详细解释
     */
    private String msg;
    /**
     * 返回的结果包装在value中，value可以是单个对象
     */
    private T data;
    // 初始化无参构造
    public ApiResult() {}
    public ApiResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
