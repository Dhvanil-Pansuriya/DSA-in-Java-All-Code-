package _2DMatrix;

public class DiagonalSum {

  public static int primaryDiagonalSum(int matrix[][]) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (i == j) {
          sum += matrix[i][j];
        }
      }
    }
    return sum;
  }

  public static int secondaryDiagonalSum(int matrix[][]) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if ((i + j) == matrix.length - 1) {
          sum += matrix[i][j];
        }
      }
    }
    return sum;
  }

  public static int allDiagonalSum(int matrix[][]) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
      if (i != matrix.length - 1 - i) {
        sum += matrix[i][matrix.length - 1 - i];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    // System.out.println(primaryDiagonalSum(matrix));
    // System.out.println(secondaryDiagonalSum(matrix));
    System.out.println(allDiagonalSum(matrix));
  }
}
