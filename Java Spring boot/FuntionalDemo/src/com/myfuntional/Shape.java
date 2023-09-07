/*
 * 
   interface Area 
  {
  void calculateArea(int sides);
 } 


 public class Shape
 { 
 
     ///
 } 

create a function inside shape class that takes parameter of type Area 

 call calculate Area and provide Lambda Expression  for variable of Area interface 
 */

package com.myfuntional;


public class Shape {
    public void calculateAndPrintArea(Area area) {
        area.calculateArea(4);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

       
        shape.calculateAndPrintArea((sides) -> {
            int sideLength = 5; 
   
            System.out.println("Square Area: " + sideLength*sideLength);
        });
    }
}

/*
By Ayushi Gupta

*/