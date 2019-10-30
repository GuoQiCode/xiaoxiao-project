package com.xiaoxiao.mapper;

import com.xiaoxiao.pojo.XiaoxiaoUsers;
import com.xiaoxiao.provider.XiaoxiaoUsersProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @project_name:xiaoxiao_application
 * @date:2019/10/30:17:00
 * @author:shinelon
 * @Describe:
 */
@Repository
public interface XiaoxiaoUsersMapper
{
    /**
     * 博客用户注册
     * @param users 用户
     * @return
     */
    @InsertProvider(type = XiaoxiaoUsersProvider.class,method = "insertXiaoxiaoUsers")
    int insertXiaoxiaoUsers(@Param("users") XiaoxiaoUsers users);
}
