package org.mycloud.eureka.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 林浩<hao.lin@w-oasis.com>
 * @version 创建时间：2018年3月15日 下午1:52:56
 * 说明：zuul
 */
@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

}
