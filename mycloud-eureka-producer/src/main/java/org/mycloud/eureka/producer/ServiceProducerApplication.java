package org.mycloud.eureka.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 林浩
 * @version 创建时间：2018年3月12日 下午4:23:31
 * 说明：(Eureka 生产者-类似dubbo的producer的功能)
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProducerApplication.class, args);
    }
    
    @Value("${server.port}")
    String port;
    
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from spring cloud producer port:" +port;
    }
}
