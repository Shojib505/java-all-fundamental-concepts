package array;

import java.util.Scanner;

public class decimal_to_binary_octal_hexa {
    public static void main(String[] args) {
        Scanner boride = new Scanner(System.in);
        int deci;
        
        System.out.print("Enter your decimal number : ");
        deci= boride.nextInt();
        
        String binary = Integer.toBinaryString(deci);
        System.out.println("In Binary Number : "+binary);
        
        String octal = Integer.toOctalString(deci);
        System.out.println("In Octal Number : "+octal);
        
        String hexa = Integer.toHexString(deci);
        System.out.println("In Hexadecimal Number : "+hexa);
        
        
    }
}
