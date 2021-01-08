package cn.wenzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author leizige 2021-01-07 11:06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosServerApplication {

    /**
     * EnableDiscoveryClient
     * 开启Spring Cloud的服务注册与发现，由于这里引入了 spring-cloud-starter-alibaba-nacos-discovery模块
     * 所以Spring Cloud Common中定义的那些与服务治理相关的接口将使用Nacos的实现
     */

    public static void main(String[] args) {
        SpringApplication.run(NacosServerApplication.class, args);
    }
}
