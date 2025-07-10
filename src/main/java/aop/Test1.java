package aop;

import aop.aspects.SchoolLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

    Book book = context.getBean("bookBean", Book.class);


    UniLibrary uniLibrary = context.getBean("uniLibBean", UniLibrary.class);
    uniLibrary.addBook("Alex", book);



    context.close();
  }
}
