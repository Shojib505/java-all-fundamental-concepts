package polymorphism_shape;

public class tesyt {
    public static void main(String[] args) {
        
        shape s = new shape();
        System.out.println(s.area());
        
        s= new rectangular(10,20);
        System.out.println(s.area());
        
        s = new traingular(10,20);
        System.out.println(s.area());
        
        /**
         * shape[] s = new shape[3];
        
        s [0] = new shape();
        s [1]= new rectangular(10,20);
        s [2] = new traingular(10,20);
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println(s[i].area());
        
            
        }
         * 
         */
        
                
                
    }
}
