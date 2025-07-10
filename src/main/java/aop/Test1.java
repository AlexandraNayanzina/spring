package aop;

import aop.aspects.SchoolLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

    UniLibrary uniLibrary = context.getBean("uniLibBean", UniLibrary.class);
    uniLibrary.getBook();
    uniLibrary.returnMagazine();
    uniLibrary.addBook();



    context.close();
  }
}
