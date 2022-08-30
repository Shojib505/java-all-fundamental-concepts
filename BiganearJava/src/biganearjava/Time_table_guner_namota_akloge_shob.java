package biganearjava;

import java.util.Scanner;

public class Time_table_guner_namota_akloge_shob {
    
    public static void main(String[] args){
    
        Scanner boride = new Scanner(System.in);
        int fast,last;
        
        System.out.print("Enter Initial Number = ");
        fast = boride.nextInt();
        
        System.out.print("Enter Final Number = ");
        last = boride.nextInt();
        
        for (int i = fast; i <=last; i++) {
            
            for (int j = 1; j <=10; j++) {
              System.out.println(i+"X"+j+" = "+i*j);  
            
            }
            System.out.println("\n\n");
        }
        
    }
    
}
