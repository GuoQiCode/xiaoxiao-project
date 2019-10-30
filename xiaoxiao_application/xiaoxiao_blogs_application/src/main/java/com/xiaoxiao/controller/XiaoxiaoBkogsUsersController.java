package com.xiaoxiao.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javafx.scene.chart.ValueAxis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project_name:xiaoxiao_application
 * @date:2019/10/30:16:44
 * @author:shinelon
 * @Describe:
 */
@RestController
@RequestMapping(value = "/blogs/users")
@Api(value = "博客用户控制层")
public class XiaoxiaoBkogsUsersController
{


    @GetMapping(value = "/test")
    @ApiOperation(value = "测试接口",httpMethod = "get")
    public String test()
    {
        return "test";
    }
}
