import java.util.Random;
import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть розмір матриці за рядками: ");
        int size = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введіть розмір матриці за стовбчиками: ");
        int size1 = sc1.nextInt();

        int[][] matrix = new int[3][3];
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix[i].length; ++j) {
                Random random = new Random();
                matrix[i][j] = random.nextInt(0,10);
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix[i].length; ++j) {

                Scanner sc2 = new Scanner(System.in);
                System.out.print(matrix[i][j] + " ");
                int x1 = sc2.nextInt();
                int x = matrix[i][j] = matrix[j][i];

                System.out.print(x);
            }
        }
    }
}
