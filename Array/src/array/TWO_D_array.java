package array;

public class TWO_D_array {

    public static void main(String[] args) {

        int[][] number = new int[3][4];

        number[0][0] = 5;
        number[0][1] = 10;
        number[0][2] = 15;
        number[0][3] = 20;
        number[1][0] = 25;
        number[1][1] = 30;
        number[1][2] = 35;
        number[1][3] = 40;
        number[2][0] = 45;
        number[2][1] = 50;
        number[2][2] = 55;
        number[2][3] = 60;
        

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(" " + number[row][col]);

            }
            System.out.println("");
        }
    }
}
