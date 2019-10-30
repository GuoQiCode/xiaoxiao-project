package com.xiaoxiao.pojo;


import lombok.Data;

import java.io.Serializable;

@Data
public class XiaoxiaoSorts implements Serializable
{
  private Long sortId;
  private String sortName;
  private String sortAlias;
  private String sortDescription;
  private Long parentSortId;

}
