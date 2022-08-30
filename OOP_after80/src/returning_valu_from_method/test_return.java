package returning_valu_from_method;

public class test_return {
    public static void main(String[] args) {
        Returning_value rtv = new Returning_value();
        System.out.println("Squre of 5 = "+rtv.squre(5));
        
        Returning_value rtv1 = new Returning_value();
        System.out.println("Squre of 5 = "+rtv1.squre(7));
    }
}
