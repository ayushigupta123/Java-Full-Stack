package aopdemo.aopdemo;


import org.aspectj.lang.annotation.AfterReturning;

import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorAspect {
	
	@Pointcut("execution(public * Calculator.*(..)) && args(double principal, double rate, double time)")
	   public void mypointcut(double principal, double rate, double time) {}
	    
	@AfterReturning(pointcut = "execution(* Calculator.calculateSimpleInterest(..))", returning = "result")
    public void afterReturningAdvice(double result) {
        System.out.println("After returning advice: Calculated interest = " + result);
    }
	
	

    
}
