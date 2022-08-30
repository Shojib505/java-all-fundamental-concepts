package callby_valu_referance;

public class test_reference {
    public static void main(String[] args) {
        
        call_reference ase =new call_reference();
        ase.asus= "Laptop Ase";
        
        System.out.println("what is there: "+ase.asus);
        
        
        ase.metod2(ase);
        System.out.println("what is there: "+ase.asus);
        
        
        
        
    }
}
