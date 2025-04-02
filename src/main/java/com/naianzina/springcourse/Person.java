package com.naianzina.springcourse;

public class Person {

    private Pet pet;
    private String name;
    private int age;

    public Person() {

        System.out.println("com.naianzina.springcourse.Person bean is created - constructor with no parameters");
    }

    public Person(Pet pet) {

        System.out.println("com.naianzina.springcourse.Person bean is created");
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Hello my pet");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Class com.naianzina.springcourse.Person: set pet method");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
