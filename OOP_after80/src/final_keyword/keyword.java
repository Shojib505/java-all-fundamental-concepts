package final_keyword;

public class keyword {
    String name;
    final String UNIVERCITY = "SUST"; //final variable
    final int roll; //blank final variable
    static final double gpa; // static blank final variable
    
    keyword(){
        roll = 16;
    }
    
    static{
        gpa = 4.62;
    }
    
    
    
    
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Univercity : "+UNIVERCITY);
        System.out.println("Roll : "+roll);
        System.out.println("GPA : "+gpa);
    }
            
}
