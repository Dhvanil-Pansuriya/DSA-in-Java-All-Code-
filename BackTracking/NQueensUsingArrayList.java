import java.util.ArrayList;
import java.util.List;

public class NQueensUsingArrayList {
    public static List<List<String>> solveNQueens(int n) {
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            ArrayList<Character> row = new ArrayList<>();
            for (int j = 0; j < n; j ++){
                row.add('.');
            }
            list.add(row);
        }
        return null;
    }

    public static void printBoard(char[][]board) {
        System.out.println("----- Chess Board : -----");
        for (int i = 0; i < board[0].length; i++) {
          for (int j = 0; j < board.length; j++) {
            System.out.print(board[i][j] + " ");
          }
          System.out.println();
        }
        System.out.println();
      }
    

    public static void main(String[] args) {
        solveNQueens(4);
    }

}
