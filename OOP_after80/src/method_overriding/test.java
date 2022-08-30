/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_overriding;

/**
 *
 * @author Ali_Shojib
 */
public class test {
    public static void main(String[] args) {
        methodo mo = new methodo();
        mo.name ="Muhammad";
        mo.classes = 10;
        mo.roll = 02;
        mo.sub = "Humenites ";
        
        mo.methodo();
        
        
        methodo mo1 = new methodo();
        mo1.name ="Ali Shojib";
        mo1.classes = 10;
        mo1.roll = 33;
        mo1.sub = "Humenites ";
        
        mo1.methodo();
        
        
    }
}
