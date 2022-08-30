package array;

import java.util.ArrayList;
import java.util.Collections;

public class sorting_arraylist {
    
    public static void main(String[] args) {
        
        ArrayList <Integer> num1 = new ArrayList<>();
        
        num1.add(28);
        num1.add(23);
        num1.add(77);
        num1.add(-27);
        num1.add(-10);
        num1.add(10);
        num1.add(20);
        
        System.out.println("Array list before sorting : "+num1);
        
        Collections.sort(num1);
        System.out.println("Array List After sorting in assending : "+num1);
        
        Collections.sort(num1,Collections.reverseOrder());
        System.out.println("Array List After sorting in dessending : "+num1);
    }
    
}
