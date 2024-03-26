package _2DMatrix;

import java.util.Scanner;

public class CreationMatrix {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int matrix[][] = new int[2][4];
      int n = matrix.length;
      int m = matrix[0].length;

      System.out.println(n);
      System.out.println(m);

      for (int i = 0; i < n; i++) {
        for  (int j = 0; j < m; j++) {
          matrix[i][j] = sc.nextInt();
        }
      }

      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }
    }
  }
}
