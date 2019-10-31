package com.xiaoxiao.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "用户实体类", description = "用户实体类")
public class XiaoxiaoUsers implements Serializable
{
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;
    /**
     * 用户IP
     */
    private String userIp;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户邮箱
     */
    private String userEmail;
    /**
     * 游湖手机
     */
    private String userProfilePhoto;
    /**
     * 用户注册时间
     */
    private Date userRegistrationTime;
    /**
     * 用户生日
     */
    private Data userBirthday;
    /**
     * 用户年龄
     */
    private Long userAge;
    /**
     * 用户电话
     */
    private String userTelephoneNumber;
    /**
     * 用户昵称
     */
    private String userNickname;
    /**
     * 用户签名
     */
    private String userSignature;
    /**
     * 用户真实名称
     */
    private String userRealName;

}
