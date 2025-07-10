package aop;

import aop.aspects.SchoolLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

    UniLibrary uniLibrary = context.getBean("uniLibBean", UniLibrary.class);
    uniLibrary.getBook();

    SchoolLibrary schoolLibrary = context.getBean("schoolLibBean", SchoolLibrary.class);
    schoolLibrary.getBook();
    schoolLibrary.getMagazine();
    schoolLibrary.returnBook();

    context.close();
  }
}
