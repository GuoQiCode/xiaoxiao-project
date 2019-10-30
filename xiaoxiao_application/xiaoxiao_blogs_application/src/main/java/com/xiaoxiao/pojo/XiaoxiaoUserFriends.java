package com.xiaoxiao.pojo;


import lombok.Data;

import java.io.Serializable;

@Data
public class XiaoxiaoUserFriends implements Serializable
{

    /**
     * ID
     */
  private Long id;
    /**
     * 用户ID
     */
  private Long userId;
    /**
     * 用户好友ID
     */
  private Long userFriendsId;
    /**
     * 用户签名
     */
  private String userNote;
    /**
     * 用户状态
     */
  private String userStatus;
}
