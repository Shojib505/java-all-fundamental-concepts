package type_casting;

public class test extends type{
    public static void main(String[] args) {
        type ob = (type) new test();  //upcasting 
        ob.method();
        
        test ob1 = (test)new type();  //dowingcastiong
        ob1.method();
        
        
    }
    
    
}
