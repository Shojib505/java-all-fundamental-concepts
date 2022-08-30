/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

import java.util.LinkedList;

/**
 *
 * @author Ali_Shojib
 */
public class linked_list {

    public static void main(String[] args) {
        LinkedList<String> countryName = new LinkedList();

        countryName.add("BANGLADESH");
        countryName.add("INDIA");
        countryName.add("PAKISTAN");
        countryName.add("NEPAL");
        countryName.add("SRILANKA");
        countryName.addFirst("First Country");
        countryName.addLast("Last Country");
        countryName.add(4, "Fifth country" );
        //countryName.removeFirst();
        //countryName.removeLast();
        //countryName.remove(4);
        //countryName.remove("INDIA");
        //countryName.removeAll(countryName);
        
        
        
        for (String name : countryName) {
            System.out.println(name);

        }
        System.out.println("Size of linked list : "+countryName.size());
        
        System.out.println("First eliment : "+countryName.getFirst());
        System.out.println("Last eliment : "+countryName.getLast());
        
        countryName.clear();
        System.out.println(countryName);
    }
}
