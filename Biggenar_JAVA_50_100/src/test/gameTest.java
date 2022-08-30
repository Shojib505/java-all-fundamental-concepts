package test;

public class gameTest {
    
    playerTest p1;
    playerTest p2;
    playerTest p3;
    
    void gameLuncherMethod(){
        
        p1 = new playerTest();
        p2 = new playerTest();
        p3 = new playerTest();
        
        int p1_guess_up;
        int p2_guess_up;
        int p3_guess_up;
        
        boolean is_p1_correct= false;
        boolean is_p2_correct= false;
        boolean is_p3_correct= false;
        
        int target_number = (int) (Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9....");
        System.out.println("Number to guess is "+target_number);
        
        while(true){
            
            p1.guess();
            p2.guess();
            p3.guess();
            
            p1_guess_up = p1.number;
            if (p1_guess_up==target_number){
                is_p1_correct=true;
            }
            p2_guess_up = p2.number;
            if (p2_guess_up==target_number) {
                is_p2_correct = true;
            }
            p3_guess_up = p3.number;
            if (p3_guess_up== target_number) {
                is_p3_correct = true;
            }
            
            if (is_p1_correct | is_p2_correct | is_p3_correct) {
                
                System.out.println("We have a winner !!! ");
                System.out.println("Player one got it right ? "+is_p1_correct);
                System.out.println("Player two got it right ? "+is_p2_correct);
                System.out.println("Player three got it right ? "+is_p3_correct);
                System.out.println("!! GAME OVER !!");
                break;
            }else{
                System.out.println("Player will have to try again");
            }
            
        }
        
    }
    
}
