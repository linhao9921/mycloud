package org.mycloud.eureka.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 林浩<hao.lin@w-oasis.com>
 * @version 创建时间：2018年3月13日 下午1:42:56
 * 说明：
 */
@FeignClient(value="mycloud-eureka-producer")
public interface TestService {

    /**
     * 直接访问mycloud-eureka-producer中的hi接口
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
