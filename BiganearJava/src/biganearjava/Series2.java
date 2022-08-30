package biganearjava;

import java.util.Scanner;

public class Series2 {
    public static void main(String[] args){

        Scanner duka = new Scanner(System.in);
        int m, multi = 1;
        
        System.out.print("Enter Last Number = ");
        m = duka.nextInt();
        
        for (int i = 1; i <=m; i++) {
            
            System.out.print(i+"X"+i+" ");
            multi= multi*i*i;
            
        }
        System.out.println("");
    System.out.print(multi);
    
    }
}
