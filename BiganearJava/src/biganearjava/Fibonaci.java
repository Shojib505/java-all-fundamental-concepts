package biganearjava;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner boride = new Scanner(System.in);
        int n;
        int first = 0;
        int second= 1;
        int fibo;
        
        System.out.println("How Many Fibonaci Numbers = ");
        n = boride.nextInt();
        
        System.out.print(first+" "+second);
        for (int i = 3; i <=n; i++) {
            
            fibo=first+second;
            System.out.print(" "+fibo);
            
            first=second;
            second=fibo;
            
        }
    }
    
}
