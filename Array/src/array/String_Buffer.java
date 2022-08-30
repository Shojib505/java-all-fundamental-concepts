package array;

public class String_Buffer {
    
    public static void main(String[] args) {
        
        StringBuffer x = new StringBuffer("Muhammad");
        
        System.out.println(x);
        
       
        
        x.append(" Ali Shojib ");
        x.append(20);
        
        System.out.println("My Name & age : "+x);
        
        
        
        x.replace(4, 7,"lumm");
        System.out.println("replace  :"+x);
        
        
        
        x.delete(0,7);
        System.out.println("after deleting : "+x);
        
        
        x.setLength(5);
        System.out.println("Seting length : "+x);
        
        
        x.reverse();
        System.out.println("Reverse : "+x);
        
        
        
        
        
    }
}
