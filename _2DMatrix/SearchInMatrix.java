package _2DMatrix;

public class SearchInMatrix {

  public static boolean stairCaseSearch(int matrix[][], int key) {
    int row = 0;
    int col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == key) {
        System.out.println(row + ", " + col);
        return true;
      } else if (key < matrix[row][col]) {
        col--;
      } else if (key > matrix[row][col]) {
        row++;
      } else {
        System.out.println("Key Not Found");
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = {
      { 1, 2, 3, 4, 5 },
      { 6, 7, 8, 9, 10 },
      { 11, 12, 13, 14, 15 },
      { 16, 17, 18, 19, 20 },
      { 21, 22, 23, 24, 25 },
    };
    stairCaseSearch(matrix, 108);
  }
}
