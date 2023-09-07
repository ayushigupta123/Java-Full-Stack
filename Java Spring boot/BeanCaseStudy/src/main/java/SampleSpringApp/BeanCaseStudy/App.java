package SampleSpringApp.BeanCaseStudy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mybean.*;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("springbean.xml");
        Technician technician= context.getBean(Technician.class,"technician");
        System.out.println(technician);
    }
}



/*
Practice Exercise for Spring beans using XML configuration 

       public class Device 
 { 
    private String deviceName;
    private int daysOnRent
    private Location location ;
 //getter setter methods and constructor
  }

public class Location 
 { 
  private String locationName;
//getter setter methods and constructor
 } 

 public class Technician
 { 
  private String technicianName;
  private Device device;
//getter setter methods and constructor
 } 
#Instantiate above classes using XML configuration and ApplicationContext

*/