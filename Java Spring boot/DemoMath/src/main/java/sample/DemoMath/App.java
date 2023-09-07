package sample.DemoMath;
import com.math.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Area obj=new Area();
    	
        System.out.println(obj.area(4));
        
        SimpleInterest obj1=new SimpleInterest();
        
        System.out.println(obj1.calc());
    }
}
