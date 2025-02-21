package com.xjhwang.infrastrcture.event;

import com.alibaba.fastjson.JSON;
import com.xjhwang.types.event.BaseEvent;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Component;

/**
 * 事件发布
 *
 * @author 黄雪杰 on 2024-06-11 18:14
 */
@Slf4j
@Component
public class EventPublisher {
    
    @Resource
    private RocketMQTemplate rocketMQTemplate;
    
    /**
     * 发布消息到MQ
     *
     * @param topic        消息主题
     * @param eventMessage 消息
     */
    public void publish(String topic, BaseEvent.EventMessage<?> eventMessage) {
        
        try {
            String messageJson = JSON.toJSONString(eventMessage);
            rocketMQTemplate.convertAndSend(topic, messageJson);
            log.info("发送MQ消息 topic:{} message:{}", topic, messageJson);
        } catch (Exception e) {
            log.error("发送MQ消息失败 topic:{} message:{}", topic, JSON.toJSONString(eventMessage), e);
        }
    }
}
