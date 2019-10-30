package com.xiaoxiao.pojo;


import lombok.Data;

import java.io.Serializable;

@Data
public class XiaoxiaoSorts implements Serializable
{
    /**
     * 分类ID
     */
  private Long sortId;
    /**
     * 分类名字
     */
  private String sortName;
    /**
     *分类别名
     */
  private String sortAlias;
    /**
     * 分类描述
     */
  private String sortDescription;
    /**
     * 分类的父ID
     */
  private Long parentSortId;

}
