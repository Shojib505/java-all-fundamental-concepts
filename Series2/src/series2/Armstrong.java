package series2;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner boride = new Scanner(System.in);
        int num, r, temp, sum= 0;
        
        System.out.print("Enter Your Number = ");
        num= boride.nextInt();
        
        temp = num;
        
        while(temp!=0){
        
            r= temp%10;
            sum= sum+r*r*r;
            temp= temp/10;
        }
        if(num==sum){
            System.out.println("Number Is Armstorng");
        }else{
            System.out.println("Number Is Not Armstorng");
        }
    }
    
}
