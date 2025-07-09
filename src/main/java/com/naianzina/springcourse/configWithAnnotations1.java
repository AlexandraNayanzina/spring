package com.naianzina.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class configWithAnnotations1 {

  public static void main(String [] args){

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//    Dog myDog = context.getBean("dogBean", Dog.class);
//    myDog.voice();
//    Cat myCat = context.getBean("catBean", Cat.class);
//    myCat.voice();

    Person p1 = context.getBean("personBean", Person.class);
//    p1.callMyPet();
//    p1.showCarInfo();

    context.close();

  }
}
