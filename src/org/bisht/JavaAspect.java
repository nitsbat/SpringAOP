package org.bisht;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class JavaAspect {

    @Before("allGetters()")
    public void loggingAdvice() {
        System.out.println("Logging advice. calling getMEthod");
    }

    @Before("allGetters()")
    public void transactionAdvice() {
        System.out.println("Transaction advice.");
    }

    @Pointcut("execution(* org.bisht.model.*.get*(..))")
    public void allGetters(){}

}
