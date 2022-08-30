/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_map;

import java.util.HashMap;

/**
 *
 * @author Ali_Shojib
 */
public class hash {
    public static void main(String[] args) {
        HashMap <Integer,String> coustomar = new HashMap();
        
        //put
        
        coustomar.put(101, "Naimu Uddin");
        coustomar.put(102, "Korim Uddin");
        coustomar.put(103, "Salauddin Uddin");
        coustomar.put(104, "Rohim Uddin");
        coustomar.put(105, "Fokir Uddin");
        coustomar.put(106, "Najim Uddin");
        
        System.out.println(coustomar.get(101));
        System.out.println(coustomar.get(102));
        System.out.println(coustomar.get(103));
        System.out.println(coustomar.get(104));
        System.out.println(coustomar.get(105));
        System.out.println(coustomar.get(106));
        
    }
}
