package com.naianzina.springcourse;

public class Dog implements Pet {

//    private String name;


    @Override
    public void say(){
        System.out.println("Bow - Wow");
    }

    public Dog() {
        System.out.println("com.naianzina.springcourse.Dog bean is created");
    }

    public void init(){
        System.out.println("Class com.naianzina.springcourse.Dog: init() method");
    }

    public void destroy(){
        System.out.println("Class com.naianzina.springcourse.Dog: destroy() method");
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
