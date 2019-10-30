package com.xiaoxiao.service;

import com.xiaoxiao.data.Result;
import com.xiaoxiao.pojo.XiaoxiaoUsers;

/**
 * @project_name:xiaoxiao_application
 * @date:2019/10/30:17:11
 * @author:shinelon
 * @Describe:
 */
public interface XiaoxiaoUsersService
{
    /**
     * 用户注册
     * @param users
     * @return
     */
    public Result insertXiaoxiaoUsers(XiaoxiaoUsers users) throws Exception;
}
