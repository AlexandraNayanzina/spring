package aop;


import org.springframework.stereotype.Component;

@Component("uniLibBean")
public class UniLibrary extends AbstractLibrary{

  public void getBook(){
    System.out.println("We are taking a University book");
  }

  public void getMagazine(){
    System.out.println("We are taking a University Magazine");
  }

  public void returnBook(){
    System.out.println("We are returning a University book");
  }

  public void returnMagazine(){
    System.out.println("We are returning a University magazine");
  }

  public void addBook(){
    System.out.println("We are adding a University book");
  }

  public void addMagazine(){
    System.out.println("We are adding a University Magazine");
  }



}
