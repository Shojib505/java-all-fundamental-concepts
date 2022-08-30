package biganearjava;

public class Bitswise_operator_1 {
    
    public static void main(String[] args) {
        
        int a= 32;
        int b= 64;
        
        int z= a&b;
        System.out.println("Z = " +z);
        
        z= a|b;
        System.out.println("Z = " +z);
            
        z= a^b;
        System.out.println("Z = " +z);

        
        int c = a>>2; //32/2=16/2=8
        System.out.println("C = "+c);
                
        c = b<<2;//64*2=128*2=256
        System.out.println("C = "+c);
    }
    
}
