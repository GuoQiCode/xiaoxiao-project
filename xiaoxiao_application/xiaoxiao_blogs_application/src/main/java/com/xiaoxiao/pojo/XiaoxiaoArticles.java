package com.xiaoxiao.pojo;

import lombok.Data;

import java.io.Serializable;


@Data
public class XiaoxiaoArticles  implements Serializable
{
  private long articleId;
  private long userId;
  private String articleTitle;
  private String articleContent;
  private long articleViews;
  private long articleCommentCount;
  private java.sql.Timestamp articleDate;
  private long articleLikeCount;
}
