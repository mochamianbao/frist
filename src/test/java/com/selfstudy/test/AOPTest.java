package com.selfstudy.test;

import com.selfstudy.service.IaccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试AOP的配置
 */
public class AOPTest {
    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        IaccountService as =(IaccountService)ac.getBean("accountService");
        //3.执行方法
        as.saveAccount();

    }
}
