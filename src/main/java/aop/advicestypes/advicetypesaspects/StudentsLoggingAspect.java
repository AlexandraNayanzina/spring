package aop.advicestypes.advicetypesaspects;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StudentsLoggingAspect {

  @Before("execution(* getStudents())")
  public void beforeGetStudentsLoggingAdvice(){
    System.out.println("BEFORE GET STUDENTS ADVICE: logging getting the list of students");
  }


  @AfterReturning("execution(* getStudents())")
  public void afterGetStudentsLoggingAdvice(){
    System.out.println("AFTER GET STUDENTS ADVICE: logging after getStudents method");
  }

}
