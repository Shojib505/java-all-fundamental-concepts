package array;

public class String_Builder {
    
    public static void main(String[] args) {
        
        StringBuilder ch = new StringBuilder("Ali ");
        System.out.println(ch);
        
        ch.append("Shojib");
        System.out.println("My Name Is :" +ch);
        
        //like stringbuffer same as stringbulider but
        //stringbuffer is synchronized and stringbuilder is not synchronized
        
    }
}
