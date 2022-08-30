
  package biganearjava;

public class Math_calss {
    
    public static void main(String[] args){
    
        int x = 20;
        int y = 3;
        
        int larges = Math.max(x, y);
        System.out.println("Larges Number : " +larges);
        
        int small = Math.min(x, y);
        System.out.println("Minimum Number : " +small);
    
        int abs =Math.abs(y);
        System.out.println("Abselute Numbr : " +abs);
        
        double pow = Math.pow(x, y);
        System.out.println("X to The Power = "+pow);
        
        
        double E= Math.E;
        System.out.println("E = "+E);
      
        double PI= Math.PI;
        System.out.println("PI = "+PI);
                
        int round = Math.round(52.50f);
        System.out.println("Round Number : "+round);
        
        
        
    }
}
