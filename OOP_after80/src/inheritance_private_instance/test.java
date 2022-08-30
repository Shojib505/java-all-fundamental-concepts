package inheritance_private_instance;

/**
 *
 * @author Ali_Shojib
 */
public class test {
    public static void main(String[] args) { 
            teachers ts = new teachers();
            ts.setName("Anisul Islam");
            ts.setEdu("BCS");
            ts.setAge(25);
            ts.setQulai("Best Teacher Ever");
            ts.setSellry(50000);
            
            ts.display();
            
            
            
            
            teachers ts1 = new teachers();
            ts1.setName("Alauddin jonab");
            ts1.setEdu("arabic");
            ts1.setAge(39);
            ts1.setQulai("Good Teacher");
            ts1.setSellry(30000);
            
            ts1.display();
            
            
    }
}
