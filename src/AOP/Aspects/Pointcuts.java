package AOP.Aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods(){}

    @Pointcut("execution(* test())")
    public void testMethod(){}


}
