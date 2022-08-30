package biggenar_java_50_100;

import java.util.Scanner;

public class Biggenar_JAVA_50_100 {

    public static void main(String[] args) {
        
    Scanner boride= new Scanner(System.in);
    int n;
        System.out.print("enter your number = ");
        n= boride.nextInt();
        
        for (int row =0 ; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.printf("%c"+col++);
            }
            System.out.println("");
            
        }
    }
    
}
