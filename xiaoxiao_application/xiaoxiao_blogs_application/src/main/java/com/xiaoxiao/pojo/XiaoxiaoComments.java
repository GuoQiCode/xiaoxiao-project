package com.xiaoxiao.pojo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class XiaoxiaoComments implements Serializable
{
  private String commentId;
  private String userId;
  private String articleId;
  private Long commentLikeCount;
  private Date commentDate;
  private String commentContent;
  private Long parentCommentId;
}
