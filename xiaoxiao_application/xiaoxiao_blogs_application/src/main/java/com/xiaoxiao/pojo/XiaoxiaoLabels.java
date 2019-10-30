package com.xiaoxiao.pojo;


import lombok.Data;

import java.io.Serializable;

@Data
public class XiaoxiaoLabels implements Serializable
{
  private Long labelId;
  private String labelName;
  private String labelAlias;
  private String labelDescription;
}
