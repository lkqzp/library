package com.briup.library.web.controller;


import com.briup.library.util.Message;
import com.briup.library.util.MessageUtil;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "图书控制器")
public class GaoYJ {
    @PostMapping("/add1")
    @ApiOperation(value = "添加图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookId",value="书号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value="书名",paramType = "query",dataType = "string")
    })
    public Message add1(int bookId,String name) {
        return MessageUtil.success("添加图书成功");

    }
    @GetMapping("/delete1")
    @ApiOperation(value = "删除图书")
    @ApiImplicitParam(name="bookId",value="书号",paramType = "query",dataType = "int",required = true)
    public Message delete1(int bookId){
        return MessageUtil.success("删除图书成功");
    }
    @GetMapping("/search1")
    @ApiImplicitParam(name="bookId",value="书号",paramType = "query",dataType = "int",required = true)
    public  Message search1(int bookId){
        return MessageUtil.success("查询图书成功");
    }
    @PostMapping("/change1")
    @ApiImplicitParam(name="bookId",value="书号",paramType = "query",dataType = "int",required = true)
    public  Message change1(int bookId){
        return MessageUtil.success("修改图书成功");
    }
}
