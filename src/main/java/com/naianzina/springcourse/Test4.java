package com.naianzina.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String [] asdca){


        /* Bean scope - singleton
        - The Bean is created right when Spring Container reads the config file
        - The only Bean (any object that asks the Bean gets the link to the same Bean)
         */

          /* Bean scope - prototype
        - The Bean is created only when object asks Spring Container with getBean() method
        - Every time the new Bean is created
         */
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Belka");

        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Strelka");

        System.out.println("Checking whether myDog and yourDog is the same object" + (myDog == yourDog));
        System.out.println(myDog );
        System.out.println(yourDog);
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());



    }


}
