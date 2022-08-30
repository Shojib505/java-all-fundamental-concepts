package super_keyword;

public class b_class extends a_class {
    int x = 40;
    int y = 50;
    
    void method(){
        System.out.println("X = "+super.x);
        System.out.println("Y = "+super.y);
    }
    
    
}
