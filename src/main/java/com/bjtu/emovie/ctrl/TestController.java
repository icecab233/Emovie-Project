package com.bjtu.emovie.ctrl;

import com.bjtu.emovie.job.ExampleData;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/api")
public class TestController {

    @Autowired
    RocketMQTemplate rocketMQTemplate;

    @GetMapping("/producer")
    public String producerExample(){
        ExampleData data = new ExampleData(123,"hello");
        rocketMQTemplate.convertAndSend("SpringTopicTest", data);
        return "success";
    }
}
