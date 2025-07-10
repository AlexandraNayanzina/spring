package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityAspect {

  @Before("aop.aspects.MyPointcuts.allGetMethods()")
  public void beforeGetSecurityAdvice() {
    System.out.println("before Get Security Advice: Check if the user is authorized");
  }

}
