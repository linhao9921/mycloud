package org.mycloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 林浩<hao.lin@w-oasis.com>
 * @version 创建时间：2018年3月15日 下午3:50:26
 * 说明：
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ConfigClientAppliaction {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientAppliaction.class, args);
    }

    @Value("${foo}")
    String foo;
    
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
