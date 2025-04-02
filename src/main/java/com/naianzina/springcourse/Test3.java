package com.naianzina.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String [] adsf) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);

//        com.naianzina.springcourse.Pet pet = new com.naianzina.springcourse.Dog();
        Person person = context.getBean("myPerson", Person.class);
        person.callPet();
//        person.setName("Alex");
//        person.setAge(41);
        System.out.println("com.naianzina.springcourse.Person name: " + person.getName() + ", age: " + person.getAge());


    }
}
