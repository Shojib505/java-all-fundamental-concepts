package chpterTwoPoolPuzzle;

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        //Echo e2 = new Echo();
        

        Echo e2 = e1;
        
        // ek obj or lagi e1 arok obj or lagi e2 
        //e1 diya ek object banaiya count variable o value rakle 
        //e2 diya ek object banaiya conut variabel o value rakle 
        //duio ta obj alada alada babe count variabel or used korbo
        //ar judin e2 or value e1 object dei taile e1 e2 duio ta ek count variabel re bar bar uasge korbo
        // x = 24 oibo last line 
        
        int x = 0;
        
        while(x<4){
            e1.hello();
            
            e1.count = e1.count+1;
            
            if (x>0) {
                e2.count = e2.count+1;
            }
            
            if (x>1) {
                e2.count = e2.count + e1.count;
            }
            
            x = x+1;
        }
        
        System.out.println(e2.count);
    }
    
}
