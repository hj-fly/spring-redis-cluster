package com.hj.redis.RedisClusterStudy;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import redis.clients.jedis.JedisCluster;

/**
 * Hello world!
 *
 */
public class App {
	
	private Logger logger=Logger.getLogger(getClass());
	public static void main(String[] args) {
		new App().run();
		
	}
	public void run(){
		logger.debug("test");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
//		JedisCluster jc=(JedisCluster)ctx.getBean("redisCluster");
		JedisCluster jc=(JedisCluster)ctx.getBean(JedisCluster.class);
		logger.debug("info");
				
        System.out.println(jc.set("name", "yucong"));
        System.out.println(jc.set("age", "28"));
        System.out.println(jc.set("sex", "男"));
        
        System.out.println(jc.get("name"));
        System.out.println(jc.get("age"));
        System.out.println(jc.get("sex"));
        
        logger.debug("test");
	}
	
}
