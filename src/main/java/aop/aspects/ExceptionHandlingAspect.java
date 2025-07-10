package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class ExceptionHandlingAspect {

  @Before("aop.aspects.MyPointcuts.allAddMethods()")
  public void beforeAddBookAdvice() {
    System.out.println("EXCEPTION HANDLING ADVICE: catch and handle the exceptions when add book/magazine");
    System.out.println("-------------------------------");
  }

}
