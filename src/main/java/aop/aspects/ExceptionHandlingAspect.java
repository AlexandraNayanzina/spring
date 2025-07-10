package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

  @Before("aop.aspects.MyPointcuts.allGetMethods()")
  public void beforeGetBookAdvice() {
    System.out.println("Before Exception Handling Aspect: catch and handle the exceptions when get book ar magazine");
  }

}
