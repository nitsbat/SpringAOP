package org.bisht;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class JavaAspect {

    @Before("execution(public String getName())")
    public void loggingAdvice() {
        System.out.println("Logging advice. calling getMEthod");
    }
}
