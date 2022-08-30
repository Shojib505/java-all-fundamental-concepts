package this_constractor;

public class class_ {
    int number,gpa;
    String name;
    
    class_(String name,int number){
        this.number = number;
        this.name = name;
    }
    
    class_(String name, int number, int gpa){
        this(name,number);
        this.gpa = gpa;
    }
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Number : "+number);
        System.out.println("GPA : " +gpa+"\n");
        
        
    }
}
