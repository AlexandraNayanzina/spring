package aop.aspects;

import aop.AbstractLibrary;
import org.springframework.stereotype.Component;


@Component("schoolLibBean")
public class SchoolLibrary extends AbstractLibrary {

//  @Override
//  public void getBook(){
//    System.out.println("We are taking a School book");
//  }

  public void returnBook(){
    System.out.println("We are returning a School book");
  }

  public void getMagazine(){
    System.out.println("We are taking a School Magazine");
  }
}
