package org.mycloud.eureka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 林浩<hao.lin@w-oasis.com>
 * @version 创建时间：2018年3月13日 上午10:43:42
 * 说明：测试服务类
 */
@Service
public class TestService {

    /**
     * 来自ServiceRibbonApplication的bean注入
     */
    @Autowired
    RestTemplate restTemplate;
    
    @Value("mycloud-eureka-producer")
    String producerApplicationName;
    
    public String hiService(String name) {
        return restTemplate.getForObject("http://" + producerApplicationName + "/hi?name=" + name, String.class);
    }
}
