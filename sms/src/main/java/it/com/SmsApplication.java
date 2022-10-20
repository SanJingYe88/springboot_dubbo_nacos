package it.com;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @Title:
 * @Description:
 * @author hao.li
 * @date 2022/10/1914:58
 */
@CrossOrigin//允许跨越访问
@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "it.com")
public class SmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class,args);
    }
}
