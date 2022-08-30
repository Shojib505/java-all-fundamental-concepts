package biganearjava;

import java.util.Scanner;

public class Time_tabel_guner_namota {

    public static void main (String[] args){
    
        Scanner boride = new Scanner(System.in);
        int num;
        
        System.out.print("Enter Your Namotar Number = ");
        num = boride.nextInt();
        
        for (int i = 1; i <=10; i++) {
            
            System.out.println(num+" X "+i + " = "+num*i);
          
        }
        
    }
}
