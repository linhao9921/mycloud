package org.mycloud.eureka.consumer.feign;

import org.springframework.stereotype.Component;

/**
 * @author 林浩
 * @version 创建时间：2018年3月14日 上午10:15:43
 * 说明：断路器
 */
@Component
public class TestServiceHiHystric implements TestService{

    /**
     * 当http://mycloud-eureka-producer/hi?name=无法访问时，熔断执行此方法处理
     * @param name
     * @return
     */
    @Override
    public String sayHiFromClientOne(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
