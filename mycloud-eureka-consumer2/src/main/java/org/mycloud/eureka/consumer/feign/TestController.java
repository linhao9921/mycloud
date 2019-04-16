package org.mycloud.eureka.consumer.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 林浩
 * @version 创建时间：2018年3月13日 下午1:46:28
 * 说明：
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;
    
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return "feign consumer:" + testService.sayHiFromClientOne(name);
    }
}
