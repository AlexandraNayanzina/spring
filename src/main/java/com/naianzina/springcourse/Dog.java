package com.naianzina.springcourse;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {

  Dog(){
    System.out.println("Dog bean is created");
  }

  @Override
  public void voice(){
    System.out.println("Bow-Wow");
  }
}
