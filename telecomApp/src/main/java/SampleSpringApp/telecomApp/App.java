package SampleSpringApp.telecomApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mybean.*;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("springbean.xml");
        Customer customer= context.getBean(Customer.class,"customer");
        System.out.println(customer);
        ServicePlan plan =customer.getService_plan();
        MyDbInfo info=plan.getMyDbInfo();
        System.out.println(info.getMyDbInfo());
        context.close();
    }
}
