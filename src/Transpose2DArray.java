import java.util.Scanner;

public class Transpose2DArray {
    public static void main(String args[]) {
        int m, n, c, d;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of 2D array: ");
        m = in.nextInt();
        n = in.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Enter the elements of 2D array: ");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                matrix[c][d] = in.nextInt();

        System.out.println("The original 2D array: ");
        for (c = 0; c < n; c++) {
            for (d = 0; d < m; d++)
                System.out.print(matrix[c][d] + "\t");

            System.out.print("\n");
        }



        int transpose[][] = new int[n][m];

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                transpose[d][c] = matrix[c][d];

        System.out.println("Transpose of the 2D array: ");

        for (c = 0; c < n; c++) {
            for (d = 0; d < m; d++)
                System.out.print(transpose[c][d] + "\t");

            System.out.print("\n");
        }
    }
}
