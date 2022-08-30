package static_variable;

public class student {
    String name;
    int id;
    static String university ;
    
    student(String n, int i, String u){
        name= n;
        id = i;
        university = u;
    };
    
    void details(){
        System.out.println("Name : "+name);
        System.out.println("ID Number : "+id);
        System.out.println("University Name : "+university);
        
    };
    
    
}
