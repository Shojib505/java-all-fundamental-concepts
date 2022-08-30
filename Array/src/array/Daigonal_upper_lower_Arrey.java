package array;

import java.util.Scanner;

public class Daigonal_upper_lower_Arrey {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] A = new int[3][3];
        int sumOfDiagolal=0;
        int sumOfUpper=0;
        int sumOfLower=0;
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col]=input.nextInt();
            }
        }    
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (row==col) {
                        sumOfDiagolal= sumOfDiagolal+A[row][col];
                    }
                    
                    if (row<col) {
                        sumOfUpper= sumOfUpper+A[row][col];
                    }
                    
                    if (row>col) {
                        sumOfLower= sumOfLower+A[row][col];
                    }
                }
            }
            
        System.out.println("Sum Of Daigonal Is = "+sumOfDiagolal);
        System.out.println("Sum Of Upper Is = "+sumOfUpper);
        System.out.println("Sum Of Lower Is = "+sumOfLower);
    }
}
