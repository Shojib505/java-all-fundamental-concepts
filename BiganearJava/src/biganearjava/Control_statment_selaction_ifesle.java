package biganearjava;

import java.util.Scanner;

public class Control_statment_selaction_ifesle {
    
    public static void main(String[] args) {
               
        Scanner input = new Scanner(System.in);
        int num;
        
        
        
        System.out.print("Enter Yur Number : ");
        num= input.nextInt();
        
    if(num>0){
        System.out.println("Number Is Positive");
            
        
        }else if(num<0){
          
        System.out.println("Number Is Big");
                 
        }else{
        System.out.println("Number Is Zero");
                 }
        }
}
            
                
      
