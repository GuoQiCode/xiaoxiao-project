package com.xiaoxiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @project_name:xiaoxiao_application
 * @date:2019/10/30:16:35
 * @author:shinelon
 * @Describe:
 */
@SpringBootApplication
@MapperScan(value = "com.xiaoxiao.mapper")
@PropertySource(value = "classpath*:properties.properties")
public class XiaoxiaoBlogsApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(XiaoxiaoBlogsApplication.class, args);
    }
}
