package array;

import java.util.ArrayList;

public class ArryList_part2 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println("size = "+num.size());
        
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(1,50);
        
        System.out.println("Array List Contains : "+num);
        System.out.println("");
        System.out.println("size = "+num.size());
        
        
        num.set(3, 60);
        System.out.println("After setting = "+num);
        
        int x = num.get(4);
        System.out.println("4th Number Index data is = "+x);
        
        int pos = num.indexOf(40);
        System.out.println("The Index Of 40 is : "+pos);
        
        boolean contain = num.contains(50);
        System.out.println("50 is in the list is it real = "+contain);
        
        num.clear();
        System.out.println("after clear arraylist contain : "+num);
        
        boolean check = num.isEmpty();
        System.out.println(" ArrayList Empey :" +check);
        
        
    }


}
