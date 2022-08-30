/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equal_operator;

/**
 *
 * @author Ali_Shojib
 */
public class equal {
    public static void main(String[] args) {
        String password1 ="ali5690";
        String password2 = "ali5690";
        String password3 = new String("ali5690");
        String password4 = new String("ALI5690");
        
        /**
        
        System.out.println(password1 == password2);
        System.out.println(password1 == password3);
        System.out.println(password2 == password4);
        System.out.println(password1 == password2);
        */
        
                
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equalsIgnoreCase(password4));
        System.out.println(password2.equals(password3));

        
    }
}
