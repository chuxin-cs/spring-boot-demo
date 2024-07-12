package com.chuxin.demotodolist.common.result;
import lombok.Data;
import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    // 定义要返回的格式
    private int code;
    private T data;
    private String msg;
    // 增加 result 方法 简化 failed 的无参构造和有参构造方法的代码量
    private static <T> Result<T> result(int code, String msg, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }
    // 定义失败方法只传msg
    public static <T> Result<T> failed(String msg) {
        return result(201, msg, null);
    }
    // 定义失败方法只传code 和 msg
    public static <T> Result<T> failed(int code, String msg) {
        return result(code, msg, null);
    }
    // 定义失败的无参构造
    public static <T> Result<T> failed() {
        return result(201, "操作失败", null);
    }
    // 定义失败方法的有参构造
    public static <T> Result<T> failed(int code, String msg, T data) {
        return result(code, msg, data);
    }

    // 定义成功方法的无参构造方法
    public static <T> Result<T> success() {
        return success(null);
    }

    // 定义成功方法的有参构造方法  这里的data 就是有参构造
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(0);
        result.setMsg("操作成功");
        result.setData(data);
        return result;
    }
}
