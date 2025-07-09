package com.naianzina.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("personBean")
public class Person {


  private Pet pet;
  private Car car;
  private String name;
  private int age;


  public void showCarInfo(){
    System.out.println("The person has a car: " + car.getModel());
  }

  public void callMyPet(){
    System.out.println("Hello my pet");
    pet.voice();
  }


  public Pet getPet() {
    return pet;
  }


  @Autowired
  @Qualifier("catBean")
  public void setPet(Pet pet) {
    System.out.println("Class Person set pet");
    this.pet = pet;
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

  public Car getCar() {
    return car;
  }

  @Autowired
  public void setCar(Car car) {
    System.out.println("Class Person set car");
    this.car = car;
  }
}
