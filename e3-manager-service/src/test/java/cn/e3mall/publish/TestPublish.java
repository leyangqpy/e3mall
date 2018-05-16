package cn.e3mall.publish;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qianpyn on 2018/5/9.
 */
public class TestPublish {
    @Test
    public void publishTest()throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        System.out.println("服务已经启动。。。。");
        System.in.read();
        System.out.println("服务已经关闭");
    }
}
