package guessing_game;

public class GuessGame {
    
    Player p1;
    Player p2;
    Player p3;
    
    void StartGame(){
        
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        int guess_up_p1;
        int guess_up_p2;
        int guess_up_p3;
        
        boolean is_p1_correct = false;
        boolean is_p2_correct = false;
        boolean is_p3_correct = false;
        
        int target_number = (int) (Math.random()*10);
        
        System.out.println("I'm thinking of a number between 0 and 9...");
        
        while(true){
            
            System.out.println("Number to guess is "+target_number);
            
            p1.guess();
            p2.guess();
            p3.guess();
            
            guess_up_p1 = p1.number;
            System.out.println("Player Number One Guessed "+guess_up_p1);
            
            guess_up_p2 = p2.number;
            System.out.println("Player Number Two Guessed "+guess_up_p2);
            
            guess_up_p3 = p3.number;
            System.out.println("Player Number Three Guessed "+guess_up_p3);
            
            if (guess_up_p1 == target_number) {
                is_p1_correct = true;
            }
            if (guess_up_p2 == target_number) {
                is_p2_correct = true;
            }
            if (guess_up_p3 == target_number) {
                is_p3_correct = true;
            }
            
            if (is_p1_correct || is_p2_correct || is_p3_correct) {
                System.out.println("We Have a winner !!!!! ");
                
                System.out.println("Player One got it right ? "+is_p1_correct);
                
                System.out.println("Player Two got it right ? "+is_p2_correct);
                
                System.out.println("Player Three got it right ? "+is_p3_correct);
                
                System.out.println("! GAME OVER !");
                
                break;
            }else{
                System.out.println("\n Player's have to try agian :) \n\n");
            }
            
        }
        
        
        
        
    }
    
}
