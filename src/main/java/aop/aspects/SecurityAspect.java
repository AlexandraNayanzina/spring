package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class SecurityAspect {

  @Before("aop.aspects.MyPointcuts.allAddMethods()")
  public void beforeAddSecurityAdvice() {
    System.out.println("SECURITY ADVICE: Check if the user is authorized");
    System.out.println("-------------------------------");
  }

}
