package exceptions;

/**
 *
 * @author Ali_Shojib
 */
public class Exception {
    public static void main(String[] args) {
        try{
            int[] a = new int [5];
            a[5] = 20;
            
            System.out.println("Arry Is : "+a);
            
            
            
            
            /***int x = 10;
            int y = 0;
        
            int z= x/y;
            System.out.println("Ans Is : "+z);
            ***/
            
                }catch(ArrayIndexOutOfBoundsException e){
            
            System.out.println("Exception : "+e);
        
            }
        
        finally{
            System.out.println("Last Line");
        }
        
    }
    
}

