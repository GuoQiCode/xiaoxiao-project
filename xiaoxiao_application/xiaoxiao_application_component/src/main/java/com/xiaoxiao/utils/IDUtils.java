package com.xiaoxiao.utils;

/**
 * @project_name:xiaoxiao_application
 * @date:2019/10/30:17:20
 * @author:shinelon
 * @Describe:
 */
public class IDUtils
{
    /**
     * 获取ID
     * @return
     */
    public static long getID(){
        long timeMillis = System.currentTimeMillis();
        String s = Double.toString(Math.random()).toString().substring(13);
        long id = Long.parseLong(s + timeMillis);
        return id;
    }
}
