
package area_formula;

import java.util.Scanner;

public class Rectangle_area {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double Lenth,Width,area;
        
        System.out.print("Enter Lenth : ");
        Lenth = input.nextDouble();
        
        System.out.print("Enter Width : ");
        Width = input.nextDouble();
  
        area = Lenth*Width;
        
        System.out.println("Area OF Rectangle : "+area);
        
    }
}
