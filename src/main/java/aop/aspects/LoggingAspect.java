package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(1)
public class LoggingAspect {

  @Before("aop.aspects.MyPointcuts.allAddMethods()")
  public void beforeAddBookAdvice(JoinPoint joinPoint) {

    System.out.println("LOGGING ADVICE: The attempt to get the book");
    System.out.println("-------------------------------");


    System.out.println("*** JoinPoint Information -> Method Signature ***");
    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    System.out.println("methodSignature" + methodSignature);
    System.out.println("methodSignature.getMethod()" + methodSignature.getMethod());
    System.out.println("methodSignature.getReturnType()" + methodSignature.getReturnType());
    System.out.println("methodSignature.getName()" + methodSignature.getName());


    System.out.println("*** JoinPoint Information -> Method Parameters *** ");
    if(methodSignature.getName().equals("addBook")){
      Object[] arguments  = joinPoint.getArgs();
      for(Object obj:arguments){
        if(obj instanceof Book){
          Book myBook = (Book) obj;
          System.out.println("Book information: " + myBook.getName() +
              "Author: " + myBook.getAuthor() +
              "Year of publishing: " + myBook.getYearOfPublication());
        } else if(obj instanceof String){
          System.out.println("The book was added by: " + obj);
        }
      }

    }

  }
}
