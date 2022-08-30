/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_problem_solve;

import java.util.Scanner;

/**
 *
 * @author Ali_Shojib
 */
public class exceptions {

    public static void main(String[] args) {
        
        int count =1;
        do{

            try {
                Scanner input = new Scanner(System.in);

                System.out.print("Please enter an num1 : ");
                int num1 = input.nextInt();

                System.out.print("Plase enter an num2 : ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("Result : " + num1 + "/" + num2 + " = " + result);
                count =2;

            } catch (Exception e) {
                System.out.println("Exception : " + e);
                System.out.println("You must enter integer. Please try again");

            }

        }while(count ==1);
    }
}
