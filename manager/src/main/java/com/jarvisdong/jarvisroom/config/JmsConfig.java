package com.jarvisdong.jarvisroom.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * ClassName: ActiveMQConfig
 * Function: activeMQ配置.
 * @author Murphy.Chang
 */
@EnableJms
@Configuration 
public class JmsConfig {
	/**
	 * 点对点的消息发布
	 * @author Murphy.Chang
	 */
	@Bean
    public Queue queue() {
        return new ActiveMQQueue("zjbi.queue");
    }
	
	/**
	 * 发布/订阅的消息发布
	 * @author Murphy.Chang
	 */
	@Bean
    public Topic topic(){
        return new ActiveMQTopic("zjbi.topic");
    }
	
    /**
     * queue模式监听器配置
     * @author Murphy.Chang
     * @param connectionFactory
     * @return
     */
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerQueue(ActiveMQConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setConnectionFactory(connectionFactory);
        return bean;
    }
    
    /**
     * topic模式监听器配置
     * @author Murphy.Chang
     * @param connectionFactory
     * @return
     */
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ActiveMQConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setConnectionFactory(connectionFactory);
        return bean;
    }
}  

