package polymorphism;

public class test {
    
    public static void main(String[] args) {
        
        person p = new person();
        p.display();
        
        p= new teachers();
        p.display();
        
        p= new students();
        p.display();
        
        
        
        
    }
}
