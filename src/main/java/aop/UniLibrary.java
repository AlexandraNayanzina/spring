package aop;


import org.springframework.stereotype.Component;

@Component("uniLibBean")
public class UniLibrary extends AbstractLibrary{

  public void getBook(){
    System.out.println("We are taking a University book");
  }
}
