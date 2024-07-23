package com.chuxin.demotodolist.controller;

import com.chuxin.demotodolist.common.result.Result;
import com.chuxin.demotodolist.entity.User;
import com.chuxin.demotodolist.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;

import java.util.List;

@RestController
@RequestMapping("/user")
@Tag(name = "body参数")
public class UserController {
    @Autowired
    private UserService userService;

    // 查看  (用来演示 接口文档的)
    @GetMapping("/getList1")
    @Operation(summary = "获取用户列表")
    @Parameters({
            @Parameter(name = "page", description = "页数"),
            @Parameter(name = "pageSize", description = "页码"),
    })
    public Result<List<User>> getList1(@RequestParam int page, @RequestParam int pageSize) {
        return userService.getList(page, pageSize);
    }

    // 测试
    @GetMapping("/failedTest")
    public Result test() {
        // return Result.failed();
        // 这里打印看能取到值么
        System.out.println(ResultEnum.SUCCESS_CODE);
        // 传参中使用常量
        return Result.failed(ResultCode.SUCCESS_CODE, ResultCode.SUCCESS_MSG);
    }

    // 增加
    @PostMapping("/add")
    private Integer add(@RequestBody User user) {
        return userService.add(user);
    }

    // 删除
    @PostMapping("/delete")
    public Integer delete(@RequestBody User user) {
        return userService.delete(user.getId());
    }

    // 修改
    @PostMapping("/edit")
    public Integer edit(@RequestBody User user) {
        return userService.edit(user);
    }

    // 查看
    @GetMapping("/getList")
    public Result<List<User>> getList(@RequestParam int page, @RequestParam int pageSize) {
        return userService.getList(page, pageSize);
    }
}
