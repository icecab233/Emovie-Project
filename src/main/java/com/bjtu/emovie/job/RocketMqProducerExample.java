package com.bjtu.emovie.job;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

public class RocketMqProducerExample {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        //创建一个生产者，参数producerGroup01为生产者组名称
        DefaultMQProducer producer = new DefaultMQProducer("producerGroup01");
        //指定RocketMQ的nameServer地址
        producer.setNamesrvAddr("127.0.0.1:9876");
        //设置当发送失败时重试发送的次数为3次，默认为2次
        producer.setRetryTimesWhenSendFailed(3);
        //设置发送超时时限为5s，默认3s
        producer.setSendMsgTimeout(5000);
        //开启生产者
        producer.start();
        //生产并发送100条消息
        for (int i = 0; i < 100; i++){
            //创建要发送的消息体
            byte[] body = ("Hi," + i).getBytes();
            //创建消息，参数someTopic为主题topic，someTag为tag，body为需要发送的消息
            Message msg = new Message("SomeTopic", "someTag", body);
            // 为消息指定key
            msg.setKeys("key-" + i);
            // 发送消息
            SendResult sendResult = producer.send(msg);
            System.out.println(sendResult);
        }
        //关闭producer
        producer.shutdown();
    }
}
