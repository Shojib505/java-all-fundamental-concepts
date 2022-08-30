package array;

public class string {
    
    public static void main(String[] args) {
        
        String st1 = "muhammad ali shojib";
        String st2 = new String("Muhammad Ali");
        
        System.out.println("First String Value : "+st1);
        
        System.out.println("Second String Value : "+st2);
        
        int len = st1.length();
        System.out.println("Length Of First String is : "+len);
        
        if (st1.equalsIgnoreCase(st2)) {
            System.out.println("First String Is Equals To Second String");
            
        }else{
            System.out.println("First String Is Not Equals To Second String");
        }
        
        
        boolean m =st2.contains("Muhammad");
        System.out.println("is :"+m);
        
        boolean i = st1.isEmpty();
        System.out.println("is : "+i);
        
        
    }
    
}
