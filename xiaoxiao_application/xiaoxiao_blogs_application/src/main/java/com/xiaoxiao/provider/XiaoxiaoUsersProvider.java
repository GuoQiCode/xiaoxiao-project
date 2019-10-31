package com.xiaoxiao.provider;

import com.xiaoxiao.pojo.XiaoxiaoUsers;
import org.apache.ibatis.jdbc.SQL;

/**
 * @project_name:xiaoxiao_application
 * @date:2019/10/30:17:09
 * @author:shinelon
 * @Describe:博客用户mapper的Provider
 */
public class XiaoxiaoUsersProvider
{





    /**
     * 用户插入数据
     * @param users  用户对象
     * @return
     */
    public String insertXiaoxiaoUsers(XiaoxiaoUsers users)
    {
        return new SQL()
        {
            {
                INSERT_INTO("xiaoxiao_users");
                if (users.getUserId() != null && users.getUserId() != 0L)
                {
                    VALUES("user_id", "#{users.userId}");
                }

                if (users.getUserIp() != null && users.getUserIp() != "")
                {
                    VALUES("user_ip", "#{users.userIp}");
                }

                if (users.getUserName() != null && users.getUserName() !="")
                {
                    VALUES("user_name", "#{users.userName}");
                }

                if (users.getUserPassword() != null && users.getUserPassword() != "")
                {
                    VALUES("user_password", "#{users.userPassword}");
                }

                if (users.getUserEmail() != null && users.getUserEmail() != "")
                {
                    VALUES("user_email", "#{users.userEmail}");
                }

                if (users.getUserProfilePhoto() != null && users.getUserProfilePhoto() != "")
                {
                    VALUES("user_profile_photo", "#{users.userProfilePhoto}");
                }

                if (users.getUserRegistrationTime() != null && users.getUserRegistrationTime().toInstant().toString() != "" )
                {
                    VALUES("user_registration_time", "#{users.userRegistrationTime}");
                }

                if (users.getUserBirthday() != null && users.getUserBirthday().toString() != "")
                {
                    VALUES("user_birthday", "#{users.userBirthday}");
                }

                if (users.getUserAge() != null && users.getUserAge() != 0)
                {
                    VALUES("user_age", "#{users.userAge}");
                }

                if (users.getUserTelephoneNumber() != null && users.getUserTelephoneNumber() != "")
                {
                    VALUES("user_telephone_number", "#{users.userTelephoneNumber}");
                }

                if (users.getUserNickname() != null && users.getUserNickname() != "")
                {
                    VALUES("user_nickname", "#{users.userNickname}");
                }
            }
        }.toString();
    }
}
