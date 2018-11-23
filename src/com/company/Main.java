package com.company;

import com.moonlit.myspring.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //从spring容器中加载对象
        //初始化spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Hero hero = (Hero)context.getBean("guanyu");
        hero.perform();

//        Perform performer = (Perform) context.getBean("zhaoliying");
//        performer.perform();
//        System.out.println("第一个节目");
//        Perform performer = (Perform)context.getBean("com.moonlit.Juggler");
//        performer.perform();

//        System.out.println("第二个节目");
//
//        performer = (Perform) context.getBean("xiaobao");
//
//        performer.perform();
//        System.out.println("第三个节目");
//
//
//        performer = (Perform) context.getBean("liudehua");
//        performer.perform();


    }
}
