package com.xiaoxiao.pojo;


import lombok.Data;

import java.io.Serializable;

@Data
public class XiaoxiaoSetArtitleLabel implements Serializable
{

    /**
     *文章ID
     */
    private Long articleId;
    /**
     *标签ID
     */
    private Long labelId;
}
