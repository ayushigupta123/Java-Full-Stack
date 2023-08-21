package aopdemo.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
