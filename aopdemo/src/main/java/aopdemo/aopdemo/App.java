package aopdemo.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.scan("aopdemo.aopdemo");
        context.refresh();
        Calculator calculator = context.getBean(Calculator.class);
        double interest = calculator.calculateSimpleInterest(1000, 5, 2);
        System.out.println("Calculated interest = " + interest);
        context.close();
  
    }
}


/*
 *   Exercise for AOP - 15 mins
 1.Create a class Calculator to calculate simpleintrest and create instance of class using dependency injection 
 2.Apply AOP advice to class Calculator methods to get result after method execution using AfterReturning
 
 
 */
