/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package to_string;

/**
 *
 * @author Ali_Shojib
 */
public class method {
    
    String name;
    int age;

    public method(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Name : "+name +"\nAge : "+age;
    }
    
}
