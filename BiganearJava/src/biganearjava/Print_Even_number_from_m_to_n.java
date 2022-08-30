package biganearjava;

import java.util.Scanner;

public class Print_Even_number_from_m_to_n {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int m,n;
       
       System.out.print("Enter Your Frist Number : ");
       m=input.nextInt();
       
       System.out.print("Enter Your Second Number : ");
       n=input.nextInt();
       
        for (int i = m; i<=n; i++)
            
            if (i%2==0) {
                System.out.print(" "+i);
                sum= sum +i;
            }
            System.out.println("");
            System.out.println("The Sum Is : " +sum);

    }
    
}
