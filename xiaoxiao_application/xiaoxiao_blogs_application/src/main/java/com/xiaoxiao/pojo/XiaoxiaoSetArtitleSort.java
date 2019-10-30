package com.xiaoxiao.pojo;


import lombok.Data;

import java.io.Serializable;


@Data
public class XiaoxiaoSetArtitleSort implements Serializable
{
    /**
     * 文章ID
     */
    private Long articleId;
    /**
     *分类ID
     */
    private Long sortId;
}
