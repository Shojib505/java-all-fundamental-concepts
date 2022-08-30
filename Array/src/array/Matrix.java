package array;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int [][] A = new int [2][3];
        int [][] B = new int [2][3];
        int [][] C = new int [2][3];
        
        //A matrix input
        System.out.println("Enter Your Elimants For A Matrix ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A (%d)(%d)= ",row,col);
                A[row][col]= input.nextInt();
            }
        }
        //B matrix input
        System.out.println("Enter Your Elimants For B Matrix ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B (%d)(%d)= ",row,col);
                B[row][col]= input.nextInt();
            }
        }
        
        //A matrix output
        System.out.print("A = ");
        for (int row = 0; row <2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println("");
        }
        
        System.out.println("\n");
        
        //B matrix output
        System.out.print("B = ");
        for (int row = 0; row <2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+B[row][col]);
            }
        System.out.println("");
            
        }
        
        System.out.println("\n");
        
        System.out.print("sum = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C [row][col] = A[row][col]*B[row][col];
                System.out.print("\t"+C[row][col]);
            }
            System.out.println("");
        }
    }
}
