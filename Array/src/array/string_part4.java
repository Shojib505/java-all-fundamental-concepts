package array;

public class string_part4 {
    
    public static void main(String[] args) {
        
        String ch = "This is a test for string";
        System.out.println(ch);
        
        String in= ch.replace('t','A');
        System.out.println("new Text: "+in);
        
        String [] c = ch.split(" ");
        for (String x:c) {
                System.out.println(x);
    
        }
    }
}
