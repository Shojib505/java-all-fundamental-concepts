package array;

import java.util.Scanner;

public class String_palindrom {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String ch ;
        
        System.out.println("Enter Your word : ");
        ch = input.next();
        
        StringBuffer x = new StringBuffer(ch);
        
        String ch1 = x.reverse().toString();
        
        if (ch.equalsIgnoreCase(ch1)){
            System.out.println("This Word Is Palindrom");
        
        }else{
            System.out.println("This Word Is Not Palindrom");
        }
        
    }

    
}
