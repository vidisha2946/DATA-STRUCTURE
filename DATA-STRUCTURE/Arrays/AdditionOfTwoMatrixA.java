import java.util.Scanner;

public class AdditionOfTwoMatrixA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][2];
        int[][] m3 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("m1[" + i + "][" + j + "]=");
                m1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("m2[" + i + "][" + j + "]=  ");
                m2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("m3[" + i + "][" + j + "]=" + m3[i][j]);
            }
        }
    }
}