package com.naianzina.springcourse;

import org.springframework.stereotype.Component;



@Component
public class Cat implements Pet {

    public void say(){
        System.out.println("Meow - Meow");
    }

    public Cat() {
        System.out.println("com.naianzina.springcourse.Cat bean is created");
    }
}
