package array;

import java.util.Random;

public class random_number {
    public static void main(String[] args) {
        
        Random ran = new Random();
        int ra = ran.nextInt(10)+1;//0 to 10
        System.out.println("Random Number : "+ra);
        
        int rand = (int)(Math.random()*100);
        System.out.println("Math random : "+rand);
    }
}
