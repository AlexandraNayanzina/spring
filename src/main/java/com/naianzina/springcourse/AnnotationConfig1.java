package com.naianzina.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfig1 {

    public static void main(String [] sdvds){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat cat = context.getBean("cat", Cat.class);

        cat.say();

        context.close();

    }
}
