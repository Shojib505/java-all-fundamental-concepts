
package area_formula;

import java.util.Scanner;

public class Triagle_area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double base, hight, area;

        System.out.print("Enter Base : ");
        base = input.nextDouble();

        System.out.print("Enter Hight : ");
        hight = input.nextDouble();

        area = 0.5 * base * hight;

        System.out.println("Area Of Triangle : " + area);

    }
}
