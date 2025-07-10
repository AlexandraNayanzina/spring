package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

  @Pointcut("execution(* aop.UniLibrary.get*())")
  private void allGetMethodsFromUniLibrary(){};

  @Pointcut("execution(* aop.UniLibrary.return*())")
  private void allReturnMethodsFromUniLibrary(){};

  @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
  private void allGetAndReturnMethodsFromUniLibrary(){};

  @Before("allGetMethodsFromUniLibrary()")
  public void beforeGetLoggingAdvice(){
    System.out.println("Before Get Logging Advice: writing Log #1");
  }

  @Before("allReturnMethodsFromUniLibrary()")
  public void beforeReturnLoggingAdvice(){
    System.out.println("Before Return Logging Advice: writing Log #2");
  }

  @Before("allGetAndReturnMethodsFromUniLibrary()")
  public void beforeGetAndReturnLoggingAdvice(){
    System.out.println("Before Return Logging Advice: writing Log #3");
  }

//
//  @Pointcut("execution (public void get*())")
//  private void allGetMethods(){}
//
//  @Before("allGetMethods()")
//  public void beforeGetBookAdvice(){
//    System.out.println("beforeGetBookAdvice: The attempt to get the book");
//  }
//
//  @Before("allGetMethods()")
//  public void beforeGetSecurityAdvice(){
//    System.out.println("before Get Security Advice: Check if the user is authorized");
//  }


}
