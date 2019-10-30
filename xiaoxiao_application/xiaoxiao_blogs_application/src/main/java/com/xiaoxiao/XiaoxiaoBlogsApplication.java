package com.xiaoxiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @project_name:xiaoxiao_application
 * @date:2019/10/30:16:35
 * @author:shinelon
 * @Describe:
 */
@SpringBootApplication
@MapperScan(value = "com.xiaoxiao.mapper")
public class XiaoxiaoBlogsApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(XiaoxiaoBlogsApplication.class, args);
    }
}
