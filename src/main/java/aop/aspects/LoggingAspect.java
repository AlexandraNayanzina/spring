package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

  @Before("execution (public void get*())")
  public void beforeGetBookAdvice(){
    System.out.println("beforeGetBookAdvice: The attempt to get the book");
  }


  @Before("execution (* * ())")
  public void beforeReturnBookAdvice(){
    System.out.println("Before Return book advice: The attempts to return the book");
  }


}
