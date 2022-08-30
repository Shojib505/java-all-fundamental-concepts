package area_formula;

import java.util.Scanner;

public class Circle_area {
     
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        double raduis,area ;
        
        System.out.print("Enter Your Raduis : ");
        raduis = input.nextFloat();
        
        area=3.1416f*raduis*raduis;
        
        System.out.println("Circle Area : "+area);
 
    }
    
    
}
