package series2;

import java.util.Scanner;

public class prectice1 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n,multi =1;
        
        System.out.print("Enter The Last Number = ");
        n= input.nextInt();
        
        for (int i = 1; i <=n ; i=i+1) {
            System.out.print(i+" ");
            multi = multi*i*i;
            
        }
        System.out.println("");
        System.out.println(multi);
    }
    
}
