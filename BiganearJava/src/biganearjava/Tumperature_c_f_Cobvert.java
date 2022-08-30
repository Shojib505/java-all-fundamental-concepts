package biganearjava;

import java.util.Scanner;

public class Tumperature_c_f_Cobvert {
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float far,cel;  //far= Fahrenheit       cel= Celsius       
        
        System.out.print("Enter Celsius : ");
        cel= input.nextFloat();
                
        far= 1.8f*cel+32;
        System.out.println("Fahrenheit= "+far);
        
    }
}
