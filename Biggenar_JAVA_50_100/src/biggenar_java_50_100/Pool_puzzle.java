package biggenar_java_50_100;

public class Pool_puzzle {
    public static void main(String[] args) {
//                         a noise
//                         annoys
//                         an oyster    
//        
        
        int x = 0;
        
        while(x<4){
            
        System.out.print("a");
            
            if(x<1){
                System.out.print(" ");
            }
            
        System.out.print("n");
        
            if (x>1) {
                System.out.println(" oyster");
                x=x+2;
            }
            
            if(x==1){              
                System.out.print("noys");
            }
            
            if (x<1) {
                System.out.print("oise");
            
            }
            System.out.println(" ");
            x=x+1;
        }
    }
}
