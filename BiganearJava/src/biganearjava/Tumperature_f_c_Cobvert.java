package biganearjava;

import java.util.Scanner;

public class Tumperature_f_c_Cobvert {
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float far,cel;    //far= Fahrenheit       cel= Celsius             
        
        System.out.print("Enter Fahrenheit : ");
        far= input.nextFloat();
                
        cel= .556f*far-32;
        System.out.println("Celsius= "+cel);
        
       
    }
}
