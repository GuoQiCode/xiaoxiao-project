package com.xiaoxiao.pojo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class XiaoxiaoComments implements Serializable
{
    /**
     * 评论ID
     */
  private String commentId;
    /**
     * 用户ID
     */
  private String userId;
    /**
     *文章ID
     */
  private String articleId;
    /**
     * 评论次数
     */
  private Long commentLikeCount;
    /**
     * 评论时间
     */
  private Date commentDate;
    /**
     * 评论内容
     */
  private String commentContent;
    /**
     * 评论的父ID
     */
  private Long parentCommentId;
}
