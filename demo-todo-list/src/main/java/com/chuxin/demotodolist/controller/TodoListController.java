package com.chuxin.demotodolist.controller;

import com.chuxin.demotodolist.entity.ApiResult;
import com.chuxin.demotodolist.service.TodoService;
import com.chuxin.demotodolist.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/todo")
public class TodoListController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/page")
    public ApiResult find() {
        System.out.println("查询全部");
        return ApiResultHandler.success(todoService.findAll());
    }

//    public ApiResult findById() {
//
//    }
}


/***
 *  // 增加
 *     @PostMapping("/add")
 *     public String add() {
 *         return "add";
 *     }
 *
 *     // 删除
 *     @PostMapping("/delete")
 *     public String delete() {
 *         return "delete";
 *     }
 *
 *     // 修改
 *     @PostMapping("/edit")
 *     public String edit() {
 *         return "edit";
 *     }
 *
 *     // 查询所有
 *     @GetMapping("/list")
 *     public String getList() {
 *         return "list";
 *     }
 *
 *     // 查询分页
 *     @GetMapping("/page")
 *     public String getPage() {
 *         return "page";
 *     }
 * ***/