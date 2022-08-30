package biganearjava;

import java.util.Scanner;

public class Vowel_Consonant_Or_operator {
    
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        char ch;
        
        System.out.print("Enter Your Character : ");
        ch = input.next().charAt(0);
        
        if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A'||ch =='E'||ch =='O'||ch =='I'||ch =='U'){
            System.out.println("Charactear Is Vowel");
        
        }else{
            System.out.println("Charactear Is Consonent");
        
        }
        
        
    }
}
