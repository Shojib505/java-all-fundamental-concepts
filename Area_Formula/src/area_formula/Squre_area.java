package area_formula;

import java.util.Scanner;

public class Squre_area {
    
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double Lenth_or_Side,area;
        
        System.out.print("Enter Lenth Or Side : ");
        Lenth_or_Side = input.nextDouble();
        
        area=Lenth_or_Side * Lenth_or_Side;
        
        
        System.out.println("Area Of Squre : " +area);
        
       
    } 
    
}
