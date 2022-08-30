
package test;

public class playerTest {
    
    int number;
    
    void guess(){
        number = (int) (Math.random()*10);
        
        System.out.println("I'm guessing "+number);
    }
    
}
