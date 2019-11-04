package com.xiaoxiao.controller;

import com.sun.xml.internal.fastinfoset.stax.events.EventBase;
import com.xiaoxiao.data.Result;
import com.xiaoxiao.pojo.XiaoxiaoUsers;
import com.xiaoxiao.service.XiaoxiaoUsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private XiaoxiaoUsersService xiaoxiaoUsersService;


    @PostMapping(value = "/insert_xiaoxiao_users")
    @ApiOperation(value = "用户注册",httpMethod = "POST",response = Result.class,notes = "用户注册")
    public Result insertXiaoxiaoUsers(XiaoxiaoUsers users) throws Exception
    {
        return this.xiaoxiaoUsersService.insertXiaoxiaoUsers(users);
    }
}
