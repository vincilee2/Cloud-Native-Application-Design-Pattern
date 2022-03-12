package com.github.viniclee.springprometheusdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Service A rest controller
 */

 @RestController
public class controller {
    
    @Autowired
    ServiceBApiMock serviceBApiMock;

    @Autowired
    ApiLatencyMetric apiLatencyMetric; 

    @GetMapping(path = "/request")
    public void handleRequest() throws InterruptedException {
        apiLatencyMetric.GetLatencyTimer().record(() -> {
            serviceBApiMock.request();
        });
        
    }

}
