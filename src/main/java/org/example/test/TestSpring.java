package org.example.test;

import org.example.pojo.Product;
import org.example.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.example.pojo.Category;

public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        //ioc实验
//        Product p = (Product) context.getBean("p");
//
//        System.out.println(p.getName());
//        System.out.println(p.getCategory().getName());
        //aop实验
        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();
    }
}