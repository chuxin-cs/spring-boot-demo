package com.chuxin.democurd.common.result;

import com.chuxin.democurd.entity.ApiResult;

public class ApiResultHandler {

    public static ApiResult success(Object object){
        ApiResult apiResult = new ApiResult();
        apiResult.setData(object);
        apiResult.setCode(200);
        apiResult.setMsg("请求成功");
        return apiResult;
    }
    public static ApiResult success() {
        return success(null);
    }
}

