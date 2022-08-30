package array;

import java.util.Arrays;

public class Sorting_Array {
    public static void main(String[] args) {
        int[] num= {10,15,69,44,19,58,-1,-64,102};
        
        Arrays.sort(num);
        
        for (int i = 0; i < 9; i++) {
            
            System.out.print(" "+num[i]);
            
        }
        
        System.out.println("");
        
        for (int i = 8; i >=0; i--) {
            System.out.print(" "+num[i]);
            
        }
    }
}
