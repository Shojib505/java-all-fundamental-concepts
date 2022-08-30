package array;

import java.util.ArrayList;

public class arratlist_part3 {
    
    public static void main(String[] args) {
        
        ArrayList <Integer> num1 = new ArrayList<>();
        ArrayList <Integer> num2 = new ArrayList<>();
        ArrayList <Integer> num3 = new ArrayList<>();
        
        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        num1.add(60);
        System.out.println("Number 1 Array List is : "+num1);
        
        num2.add(1);
        num2.add(2);
        num2.add(3);
        num2.add(4);
        num2.add(6);
        System.out.println("Number 2 Array List is : "+num2);
        
        num3.addAll(num1);
        System.out.println("Number 3 Array List is : "+num3);
        
        boolean result = num1.equals(num2);
        System.out.println("Is Number 1 and Number 2 Array List are same : "+result);
        
        result = num1.equals(num3);
        System.out.println("Is Number 1 and Number 3 Array List are same : "+result);
        
    }
}
