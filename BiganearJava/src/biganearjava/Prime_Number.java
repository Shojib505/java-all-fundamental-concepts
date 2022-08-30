package biganearjava;

import java.util.Scanner;

public class Prime_Number {
    
    public static void main(String[] args){
    
        Scanner boride = new Scanner(System.in);
        
        System.out.print("Enter Any Number \n We will find is it prime or not = ");
        int num= boride.nextInt();
        int count=0;
        
        for (int i = 2; i < num; i++) {
            
            if (num%i==0) {
            count++;
            break;
            }
        }
        if(count==0){
                System.out.println("Number Is Prime");
        
            }else{
                System.out.println("Number Is Not Prime");
            }
            
    }
}
