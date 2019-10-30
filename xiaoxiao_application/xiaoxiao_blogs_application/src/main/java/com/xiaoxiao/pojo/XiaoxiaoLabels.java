package com.xiaoxiao.pojo;


import lombok.Data;

import java.io.Serializable;

@Data
public class XiaoxiaoLabels implements Serializable
{
    /**
     * 标签ID
     */
  private Long labelId;
    /**
     * 标签名字
     */
  private String labelName;
    /**
     *标签别名
     */
  private String labelAlias;
    /**
     *标签描述
     */
  private String labelDescription;
}
