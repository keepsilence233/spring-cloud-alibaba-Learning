package cn.wengzi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(value = "/config")
public class TestController {


    /**
     * 配置在Nacos中
     * <p>
     *    配置名称(前缀与spring.application.name一致) :
     *      alibaba-nacos-config-client.properties
     *    配置内容 :
     *      student.name = 张三
     *      student.age = 23
     * </p>
     */
    @Value("${student.name}")
    private String name;
    @Value("${student.age}")
    private Integer age;

    @GetMapping(value = "/getConfig")
    public String getConfigProperties() {
        return "name:" + name + "--" + "age:" + age;
    }
}

