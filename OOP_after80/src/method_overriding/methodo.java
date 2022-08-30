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
public class methodo extends method{
    String sub;
    int roll;

    @Override
    void methodo(){
        System.out.println("Name : "+name);
        System.out.println("Class : "+classes);
        System.out.println("Roll : "+roll);
        System.out.println("Subject : "+sub);
        System.out.println("");
        
    }
    
}
