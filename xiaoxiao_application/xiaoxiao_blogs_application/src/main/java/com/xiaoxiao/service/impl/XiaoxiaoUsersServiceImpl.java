package com.xiaoxiao.service.impl;

import com.xiaoxiao.data.Result;
import com.xiaoxiao.mapper.XiaoxiaoUsersMapper;
import com.xiaoxiao.pojo.XiaoxiaoUsers;
import com.xiaoxiao.service.XiaoxiaoUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.awt.font.TextHitInfo;

/**
 * @project_name:xiaoxiao_application
 * @date:2019/10/30:17:49
 * @author:shinelon
 * @Describe:
 */
@Service
public class XiaoxiaoUsersServiceImpl implements XiaoxiaoUsersService
{

    @Value("${msg}")
    private String msg;

    @Autowired
    private XiaoxiaoUsersMapper xiaoxiaoUsersMapper;

    /**
     *用户注册
     * @param users
     * @return
     */
    @Override
    public Result insertXiaoxiaoUsers(XiaoxiaoUsers users) throws Exception
    {
        int i = this.xiaoxiaoUsersMapper.insertXiaoxiaoUsers(users);
        if(i > 0){
            return Result.succeed(msg,true);
        }
        return Result.failed(msg,false);
    }
}
