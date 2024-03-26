public class SudokuSolver {

  public static boolean solver(int[][] sudoku, int row, int col) {
    if (row == 9) {
      return true;
    }

    int nextRow = row, nextCol = col + 1;
    if (col + 1 == 9) {
      nextRow = row + 1;
      nextCol = 0;
    }

    if (sudoku[row][col] != 0) {
      return solver(sudoku, nextRow, nextCol);
    }

    for (int i = 1; i <= sudoku.length; i++) {
      if (isSafe(sudoku, row, col, i)) {
        sudoku[row][col] = i;
        if (solver(sudoku, nextRow, nextCol)) {
          return true;
        }
        sudoku[row][col] = 0;
      }
    }
    return false;
  }

  public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
    for (int i = 0; i < sudoku.length; i++) {
      if (sudoku[i][col] == digit) {
        return false;
      }
    }

    for (int i = 0; i < sudoku.length; i++) {
      if (sudoku[row][i] == digit) {
        return false;
      }
    }

    int row3x3 = (row / 3) * 3;
    int col3x3 = (col / 3) * 3;

    for (int i = row3x3; i < row3x3 + 3; i++) {
      for (int j = col3x3; j < col3x3 + 3; j++) {
        if (sudoku[i][j] == digit) {
          return false;
        }
      }
    }

    return true;
  }

  public static void display(int sudoku[][]) {
    for (int i = 0; i < sudoku.length; i++) {
      for (int j = 0; j < sudoku[0].length; j++) {
        System.out.print(sudoku[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int sudoku[][] = {
      { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
      { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
      { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
      { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
      { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
      { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
      { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
      { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
      { 0, 0, 0, 0, 8, 0, 0, 7, 9 },
    };
    if (solver(sudoku, 0, 0)) {
      display(sudoku);
    } else {
      System.out.println("Solution not possible");
    }
  }
}
