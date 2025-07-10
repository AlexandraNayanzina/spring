package aop;


import org.springframework.stereotype.Component;

@Component("uniLibBean")
public class UniLibrary extends AbstractLibrary{

  public void getBook(){
    System.out.println("We are taking a University book");
    System.out.println("-------------------------------");
  }

  public void getMagazine(){
    System.out.println("We are taking a University Magazine");
    System.out.println("-------------------------------");

  }

  public void returnBook(){
    System.out.println("We are returning a University book");
    System.out.println("-------------------------------");

  }

  public void returnMagazine(){
    System.out.println("We are returning a University magazine");
    System.out.println("-------------------------------");

  }

  public void addBook(String personName, Book book){
    System.out.println("TARGET METHOD: We are adding a University book");
    System.out.println("-------------------------------");

  }

  public void addMagazine(){
    System.out.println("We are adding a University Magazine");
    System.out.println("-------------------------------");

  }

}
