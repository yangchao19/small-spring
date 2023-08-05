package com.yang.springframework.test;

import cn.hutool.core.io.IoUtil;
import com.yang.springframework.beans.PropertyValue;
import com.yang.springframework.beans.PropertyValues;
import com.yang.springframework.beans.factory.config.BeanDefinition;
import com.yang.springframework.beans.factory.config.BeanReference;
import com.yang.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.yang.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.yang.springframework.core.io.ClassPathResource;
import com.yang.springframework.core.io.DefaultResourceLoader;
import com.yang.springframework.core.io.Resource;
import com.yang.springframework.test.bean.UserDao;
import com.yang.springframework.test.bean.UserService;
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

    private DefaultResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_BeanFactory() {
        // 注册bean
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注册 UserDao
        beanFactory.registryBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 设置userService 属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("userId", "100001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 注册userService
        beanFactory.registryBeanDefinition("userService", new BeanDefinition(UserService.class, propertyValues));

        UserService userService = (UserService)beanFactory.getBean("userService");
        String userInfo = userService.queryUserInfo();
        System.out.println(userInfo);
    }

    @Test
    public void test_classpath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_file() throws IOException {
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_url() throws IOException {
        Resource resource = resourceLoader.getResource("https://github.com/yangchao19/small-spring/master/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_Xml() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        UserService userService = beanFactory.getBean("userService", UserService.class);

        String s = userService.queryUserInfo();
        System.out.println(s);
    }

}
