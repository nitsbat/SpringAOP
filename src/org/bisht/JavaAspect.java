package org.bisht;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class JavaAspect {
    //    This means that before all the getters inside the circle class executed, execute this method
    @Before("allCircle()")
    public void loggingAdvice(JoinPoint joinPoint) {
//        Circle circle = (Circle) joinPoint.getTarget();
//        System.out.println("Logging advice. calling " + circle.getName());
    }

    @AfterReturning(pointcut = "args(name)", returning = "returnObject")
    public void circleStringAdvice(JoinPoint joinPoint, String name, String returnObject) {
        System.out.println("Method takes string arguments(" + name +
                ") and method name : " + joinPoint.toString() + "and return object is : " + returnObject);
    }

    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void circleStringAdviceException(String name, RuntimeException ex) {
        System.out.println("Exception Thrown " + ex);
    }

    @Around("@annotation(org.bisht.annotation.Loggable)")
    public Object aroundAdviceMethod(ProceedingJoinPoint proceedingJoinPoint) {
        Object proceed = null;

        try {
            System.out.println("Before proceed");
            proceed = proceedingJoinPoint.proceed();
            System.out.println("After proceed");
        } catch (Throwable throwable) {
            System.out.println("throw proceed");
        }
        return proceed;
    }

    @Pointcut("execution(* get*())")
    public void allGetters() {
    }

    @Pointcut("within(org.bisht.model.Circle)")
    public void allCircle() {
    }

}
