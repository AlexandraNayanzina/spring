package com.naianzina.springcourse;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{

  Cat(){
    System.out.println("Cat bean is created");
  }

  public void voice(){
    System.out.println("Meow-Meow");
  }
}
