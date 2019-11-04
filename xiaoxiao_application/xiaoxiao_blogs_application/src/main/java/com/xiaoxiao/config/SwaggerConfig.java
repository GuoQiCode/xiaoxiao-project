package com.xiaoxiao.config;

import org.jcp.xml.dsig.internal.dom.DOMKeyInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import java.util.ArrayList;

/**
 * @project_name:xiaoxiao_application
 * @date:2019/10/31:16:22
 * @author:shinelon
 * @Describe:配置Swagger配置类
 */
@Configuration
public class SwaggerConfig
{

    /**
     * 作者
     */
    @Value("${AUTHOR}")
    private String AUTHOR;

    /**
     * 我的访问地址
     */
    @Value("${URL}")
    private String URL;

    /**
     * 我的URL
     */
    @Value("${EMAIL}")
    private String EMAIL;
    /**
     * 创建swagger实例
     * @return
     */
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("xiaoxiao_blogs")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xiaoxiao.controller"))
                .build();
    }


    /**
     * 创建Swagger页面
     * @return
     */
    private ApiInfo apiInfo(){
        Contact contact = new Contact(AUTHOR, URL, EMAIL);
        return new ApiInfo("欢迎使用swagger展示潇潇项目的接口",
                           "潇潇项目接口",
                           "v-1.0",
                           "www.xiaoxaioblogs.com",
                           contact,
                           "",
                           "",
                           new ArrayList<>());
    }
}
