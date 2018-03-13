package org.mycloud.eureka.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 林浩<hao.lin@w-oasis.com>
 * @version 创建时间：2018年3月13日 下午1:41:09
 * 说明：Feign负载均衡<br/>
 * 说明：(Eureka 消费者-类似dubbo的consumer的功能)
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
}
