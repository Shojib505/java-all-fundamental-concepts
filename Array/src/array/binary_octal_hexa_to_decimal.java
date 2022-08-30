package array;

import java.util.Scanner;

public class binary_octal_hexa_to_decimal {
    public static void main(String[] args) {
       
        String bai = "1010";
        Integer deci = Integer.parseInt(bai, 2);
        System.out.println(deci);
        
        
        String oct = "1546";
        Integer deci1 = Integer.parseInt(oct, 8);
        System.out.println(deci1);
        
        
        String hex = "1ABC25F";
        Integer deci3 = Integer.parseInt(hex, 16);
        System.out.println(deci3);
        
        
    }
}
