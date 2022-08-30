package static_restirction;

public class res {
    static int x = 55;
    
    void test_korram_be(int fiftyfive){
        
        fiftyfive= x;
        System.out.println("fiftyfive = "+fiftyfive);
    };
    
    static void test_sehs_monokoy(int dekisaine){
        dekisaine = x;
        System.out.println("dekisaine = "+dekisaine);
    };
    
}
