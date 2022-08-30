package array;

public class Matrix_2 {
    public static void main(String[] args) {
        int[][] num = new int[4][5];
        int kola= 0;
        
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                num[row][col]=kola;
                kola++;
                
                
            }
        }
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" "+num[row][col]);
                
            }
            System.out.println("");
        }
    }
}
