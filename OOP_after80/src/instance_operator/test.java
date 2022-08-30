/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instance_operator;

/**
 *
 * @author Ali_Shojib
 */
public class test {
    public static void main(String[] args) {
        animal a = new animal();
        person p = new person();
        teacher t = new teacher();
        
        System.out.println(a instanceof animal);
        System.out.println(p instanceof animal);
        System.out.println(t instanceof person);
        System.out.println(t instanceof animal);
        System.out.println(p instanceof teacher);
        
    }
    
}
