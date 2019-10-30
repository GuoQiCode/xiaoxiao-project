package com.xiaoxiao.pojo;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;


@Data
public class XiaoxiaoArticles  implements Serializable
{
    /**
     * 文章ID
     */
  private long articleId;
    /**
     * 用户ID
     */
  private long userId;
    /**
     * 文章标题
     */
  private String articleTitle;
    /**
     * 文章内容
     */
  private String articleContent;
    /**
     * 文章视图
     */
  private long articleViews;
    /**
     * 文章查看次数
     */
  private long articleCommentCount;
    /**
     * 文章发布时间
     */
  private Date articleDate;
    /**
     * 文章喜欢次数
     */
  private long articleLikeCount;

}
