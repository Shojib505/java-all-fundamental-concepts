package callby_valu_referance;

public class test_value {
    public static void main(String[] args) {
        call_value value = new call_value();
        int x = 60;
        System.out.println("Ali numeric : "+x);
        
        value.method1(x);
        System.out.println("Ali method : "+x);
        
        
    }
}
