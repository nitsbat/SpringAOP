package org.bisht;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class JavaAspect {

//    This means that before all the getters inside the circle class executed, execute this method
    @Before("allGetters() && allCircle()")
    public void loggingAdvice() {
        System.out.println("Logging advice. calling getMethod");
    }

    @Before("allGetters()")
    public void transactionAdvice() {
        System.out.println("Transaction advice.");
    }

    @Pointcut("execution(* get*())")
    public void allGetters(){}

    @Pointcut("within(org.bisht.model.Circle)")
    public void allCircle(){
    }

}
