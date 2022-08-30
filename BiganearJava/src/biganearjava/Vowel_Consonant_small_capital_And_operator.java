package biganearjava;

import java.util.Scanner;

public class Vowel_Consonant_small_capital_And_operator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        
        System.out.print("Enter Character : ");
        ch = input.next().charAt(0);
        
        if(ch>='A' & ch<='Z'){
            System.out.println("First Character is Capital Letter");
        
        }else if(ch>='a' & ch<='z'){
             System.out.println("First Character is Small Letter");
        
        }else{
            System.out.println("First Character is not a letter ");
        }
    }
}
