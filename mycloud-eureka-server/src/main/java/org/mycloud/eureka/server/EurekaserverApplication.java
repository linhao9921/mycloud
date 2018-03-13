package org.mycloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 林浩<hao.lin@w-oasis.com>
 * @version 创建时间：2018年3月9日 下午5:54:53
 * 说明：(Eureka 服务端-类似与zookeeper的功能)
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserverApplication.class, args);
    }

}
