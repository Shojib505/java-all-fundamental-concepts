
package biganearjava;

import java.util.Scanner;

public class Arathmatics {
    
     public static void main(String[] args){
         
         Scanner input= new Scanner(System.in);
         int Num1, Num2,Result;
        
         System.out.print("Enter 1st Nubers: ");
         Num1= input.nextInt();
         
         System.out.print("Enter 2nd Number: ");
         Num2= input.nextInt();
                     
        Result = Num1 + Num2;
        System.out.println("Sum="+Result);
        
        Result = Num1 - Num2;
        System.out.println("Minus="+Result);
        
        Result = Num1 * Num2;
        System.out.println("Multiplication="+Result);
        
        double Result1 = (double)Num1 / Num2;
        System.out.println("Divition="+Result1);
        
        Result = Num1 % Num2;
        System.out.println("Modeulas="+Result);
                         
     }
    
}
