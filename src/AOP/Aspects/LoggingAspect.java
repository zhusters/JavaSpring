package AOP.Aspects;

import AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {


    @Before("AOP.Aspects.Pointcuts.allAddMethods()")
    public void beforeAddLogAdvice(JoinPoint joinPoint) {
       MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodsignature = "+methodSignature);
        System.out.println("methodsignature getmethod = "+methodSignature.getMethod());
        System.out.println("methodsignature getreturntype = "+methodSignature.getReturnType());
        System.out.println("methodsignature getname = "+methodSignature.getName());
        System.out.println("beforeGetLogAdvice: attempt to get book/magazine");


        if (methodSignature.getName().equals("addBook")) {

            Object arr[] = joinPoint.getArgs();
            for (Object obj : arr) {
                if (obj instanceof Book) {
                    Book mybook = (Book) obj;
                    System.out.println("name - " + mybook.getName() + " year - " + mybook.getYear() + " author - " + mybook.getAuthor());
                } else if (obj instanceof String) {
                    System.out.println("added by - " + obj);
                }
            }
        }


        System.out.println("-------------------------------------");

    }


//    @Before("AOP.Aspects.Pointcuts.testMethod()")
//        public void beforeTestAdvice () {
//            System.out.println("before test");
//        }



        @Around("AOP.Aspects.Pointcuts.testMethod()")
        public Object aroundTestAdvice(ProceedingJoinPoint proceedingJoinPoint)
                throws Throwable {


            System.out.println("start around");

            Object targetMethod = proceedingJoinPoint.proceed();

            System.out.println("end around");

            return targetMethod;
        }



//    @Pointcut("execution(* return*())")
//    private void allReturnMethods() {
//    }
//
//    ;
//
//    @Pointcut("AOP.Aspects.Pointcuts.allGetMethods() || allReturnMethods()")
//    private void allGetAndReturnMethods() {
//    }
//
//    ;
//
//
//    @Pointcut("execution(* AOP.UniLibrary.* (..))")
//    private void AllMethodsFromUniLibrary() {
//    }
//
//    ;
//
//
//    @Pointcut("execution(* AOP.UniLibrary.returnMagazine()))")
//    private void returnMagazineFromUniLibraryMethod() {
//    }
//
//    ;
//
//
//    @Pointcut("AllMethodsFromUniLibrary() && !returnMagazineFromUniLibraryMethod()")
//    private void allMethodsFromUniLibraryExceptReturnMagazine() {
//    }
//
//    ;
//

//
//    @Before("execution(* return())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: return book");
//    }
//
//    @Before("allGetAndReturnMethods()")
//    public void beforeGetAndReturnLogAdvice() {
//        System.out.println("beforeGetAndReturnLogAdvice");
//    }
//
//
//    @Before("allMethodsFromUniLibraryExceptReturnMagazine()")
//    public void beforeAllMethodsFromUniLibraryExceptReturnMagazineAdvice() {
//        System.out.println("allMethodsFromUniLibraryExceptReturnMagazine");
//
//    }

    }