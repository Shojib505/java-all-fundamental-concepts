package biganearjava;

import java.util.Scanner;

public class Prime_m_to_n {
    
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        int m,n,count = 0,totalPrime=0;
        
        System.out.print("Enter Initial Number = ");
        m = input.nextInt();
        
        System.out.print("Enter Final Number = ");
        n = input.nextInt();
        
        for (int i = m; i <=n; i++) {
            
            for (int j = 2; j < i; j++) {
                
                if(i%j==0){
                count++;
                break;
                }
            }
            if(count==0){
                System.out.println(i);
                totalPrime++;
            }
           
            count=0;
        }
        System.out.println("Toral Prime Number Is = "+totalPrime);
        
    }
}
