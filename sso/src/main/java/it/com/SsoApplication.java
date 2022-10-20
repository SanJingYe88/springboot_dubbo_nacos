package it.com;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author hao.li
 * @Title:
 * @Description:
 * @date 2022/8/915:44
 */
@CrossOrigin//允许跨越访问
@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "it.com")
public class SsoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsoApplication.class, args);
    }
}
