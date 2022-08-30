package biganearjava;

import java.util.Scanner;

public class Even_Odd {
    
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Enter Number : ");
        num = input.nextInt();
    
    if(num%2==0){
        System.out.println("Number Is Even");
                }
        else{
        System.out.println("Number Is Odd");
        }
    }    
}
