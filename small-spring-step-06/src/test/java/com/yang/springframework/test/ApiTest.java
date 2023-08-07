package com.yang.springframework.test;

import cn.hutool.core.io.IoUtil;
import com.yang.springframework.beans.PropertyValue;
import com.yang.springframework.beans.PropertyValues;
import com.yang.springframework.beans.factory.config.BeanDefinition;
import com.yang.springframework.beans.factory.config.BeanReference;
import com.yang.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.yang.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.yang.springframework.context.support.ClassPathXmlApplicationContext;
import com.yang.springframework.core.io.ClassPathResource;
import com.yang.springframework.core.io.DefaultResourceLoader;
import com.yang.springframework.core.io.Resource;
import com.yang.springframework.test.bean.UserDao;
import com.yang.springframework.test.bean.UserService;
import com.yang.springframework.test.common.TestBeanFactoryPostProcessor;
import com.yang.springframework.test.common.TestBeanPostProcessor;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/12
 * @Copyright：
 */
public class ApiTest {

    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor() {
        // 1. 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 读取配置文件并注册bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        // 3. 实例化之前，修改BeanDefinition的属性值
        TestBeanFactoryPostProcessor testBeanFactoryPostProcessor = new TestBeanFactoryPostProcessor();
        testBeanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        // 4. 实例化之后，修改 Bean的属性值
        TestBeanPostProcessor testBeanPostProcessor = new TestBeanPostProcessor();
        beanFactory.addBeanPostProcessor(testBeanPostProcessor);

        UserService userService = beanFactory.getBean("userService", UserService.class);
        String info = userService.queryUserInfo();
        System.out.println("测试结果：" + info);
    }

    @Test
    public void test_Xml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String info = userService.queryUserInfo();
        System.out.println(info);
    }

}
