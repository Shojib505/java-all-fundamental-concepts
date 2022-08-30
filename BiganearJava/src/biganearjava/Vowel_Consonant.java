package biganearjava;

import java.util.Scanner;

public class Vowel_Consonant {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char cha;
        
        System.out.print("Enter Character : ");
        cha = input.next().charAt(0);
        
        if(cha=='a'){
            System.out.println("Vowel");
        
        }else if(cha=='e'){
            System.out.println("Vowel");
        
        }else if(cha=='i'){
            System.out.println("Vowel");
        
        }else if(cha=='o'){
            System.out.println("Vowel");
        
        }else if(cha=='u'){
            System.out.println("Vowel");
        
        }else{
            System.out.println("Cosonant");
        }
           }
    
    
    
}
