package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(10);
        num.add(50);
        num.add(30);
        num.add(60);
        num.add(70);
        num.add(3,90);
        num.add(80);
        
        Iterator ita = num.iterator();
        while(ita.hasNext()){
            System.out.print(" "+ita.next());
        }
        
        System.out.println("\n size of arraylist ="+num.size());
        
        num.remove(5-1);
        System.out.println(" after removeing 5th index "+num);
        
        num.removeAll(num);
        System.out.println(" after "+num);
        
    }
}
