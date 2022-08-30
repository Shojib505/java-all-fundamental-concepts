package biganearjava;

import java.util.Scanner;

public class SumOf_Digit {
    public static void main(String[] args) {
        Scanner boride = new Scanner(System.in);
        int num,r,temp,sum=0;
        
        System.out.print("Enter your number = ");
        num= boride.nextInt();
        
        temp=num;
        
        while (temp!=0){
        
            r=temp%10;
            sum= sum+r;
            temp=temp/10;
        }
        System.out.println("Sum Of Digit = "+sum);
    }
    
}
