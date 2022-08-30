package biganearjava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner boride = new Scanner(System.in);
        int n,fact = 1;
        
        System.out.print("Enter Factorial Number = ");
        n = boride.nextInt();
        
        for (int i = n; i >=1; i--) {
            
            fact = fact *i;
            
        }
        System.out.println("Factorial of "+n+" is = "+fact);
    }
    
}
