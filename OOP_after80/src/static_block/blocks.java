package static_block;

public class blocks {
    
    static int pp;
    static String papa;
    static char ch;
    
    static{
        pp= 50;
        papa = "abba";
        ch = 'A';
    };
    
    static void print(){
        System.out.println("Number : "+pp);
        System.out.println("Papa bangla Mening : "+papa);
        System.out.println("first Alfhabet is : "+ch);
    };
    
    
    public static void main(String[] args) {
        blocks.print();
    }
    
}
