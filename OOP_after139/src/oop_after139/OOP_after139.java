package oop_after139;

public class OOP_after139 {

    public static void main(String[] args) {
        
        anonymous_class ac = new anonymous_class(){
                    
                @Override
                void display(){
                    System.out.println("Overreden");
                    
                    super.display();
                }
                
        
        };
        ac.display();
        
        
        
    }
    
}
