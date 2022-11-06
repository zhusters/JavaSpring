package AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {


    @Before("AOP.Aspects.Pointcuts.allAddMethods()")
    public void beforeAddSecAdvice() {
        System.out.println("beforeGetSecAdvice: attempt to get book/magazine");
        System.out.println("-------------------------------------");

    }
}
