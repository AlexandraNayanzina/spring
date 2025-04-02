package com.naianzina.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String [] asd) throws Exception, Throwable {
        ClassPathXmlApplicationContext context =
                null;
        try {
            context = new ClassPathXmlApplicationContext("applicationContext.xml");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        Pet pet1 = context.getBean("myPet", Pet.class);
        pet1.say();

        context.close();
    }
}
