package com.chuxin.demotodolist.common.result;

import lombok.Data;
import java.io.Serializable;

@Data
public class Result<T> implements Serializable{
    // 定义要返回的格式
    private int code;
    private T data;
    private String msg;

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
