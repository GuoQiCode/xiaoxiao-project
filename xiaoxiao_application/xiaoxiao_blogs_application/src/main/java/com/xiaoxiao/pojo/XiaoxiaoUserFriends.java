package com.xiaoxiao.pojo;


import lombok.Data;

import java.io.Serializable;

@Data
public class XiaoxiaoUserFriends implements Serializable
{

  private Long id;
  private Long userId;
  private Long userFriendsId;
  private String userNote;
  private String userStatus;
}
