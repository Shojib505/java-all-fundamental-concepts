package biganearjava;

public class cotinue_loop_statement {
    
    public static void main(String[] args) {
       
        for(int i= 1; i<=100; i++){
        
            if(i==10)
                continue;
            
            System.out.println(i);
        }
        System.out.println("00000000000000000000000000000000");//quezz  2 
        for(int i= 1; i<=10; i=i+3){
        
            if(i==10)
               continue;
            
            System.out.println(i);
        }
        System.out.println("00000000000000000000000000000000");//quezz  3 
        for(int i= 1; i<=100; i=i+3){
        
            if(i==10)
               continue;

            if(i>13)
               break;
            
            System.out.println(i);
        }
    } 
}
