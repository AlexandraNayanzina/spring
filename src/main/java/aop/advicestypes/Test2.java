package aop.advicestypes;

import aop.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.CommunicationException;
import java.util.ArrayList;
import java.util.List;

public class Test2 {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfig.class);

    University university = context.getBean("universityBean", University.class);
    university.addStudents();
    List<Student> students = university.getStudents();
    System.out.println(students);

    context.close();
  }

}
