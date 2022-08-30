/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_set;

import java.util.HashSet;

/**
 *
 * @author Ali_Shojib
 */
public class set {
    public static void main(String[] args) {
        
        HashSet <String> set = new HashSet();
        
        set.add("Apple");
        set.add("Orange");
        set.add("Painapple");
        set.add("Jecfruite");
        set.add("Banana");
        
        System.out.println(set);
        System.out.println("Size : "+set.size());
        
        set.clear();
        
        boolean st = set.isEmpty();
        System.out.println(st);
        
    }
}
