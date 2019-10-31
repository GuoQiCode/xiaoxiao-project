package com.xiaoxiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @project_name:xiaoxiao_application
 * @date:2019/10/30:16:35
 * @author:shinelon
 * @Describe:
 */
@SpringBootApplication
@MapperScan(value = "com.xiaoxiao.mapper")
@PropertySource(value = "classpath:/properties.properties")
@EnableSwagger2
public class XiaoxiaoBlogsApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(XiaoxiaoBlogsApplication.class, args);
    }
}
