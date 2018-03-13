package org.mycloud.eureka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 林浩<hao.lin@w-oasis.com>
 * @version 创建时间：2018年3月13日 上午11:05:49
 * 说明：
 */
@RestController
public class TestController {
    
    @Autowired
    TestService testService;
    
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return "ribbon consumer:" + testService.hiService(name);
    }
}
