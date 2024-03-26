public class GridWays {

  // First way to find total ways of grid
  public static int gridWay(int i, int j, int n, int m) {
    if (i == n - 1 || j == m - 1) {
      return 1;
    } else if (i == n || j == m) {
      return 0;
    }
    return gridWay(i + 1, j, n, m) + gridWay(i, j + 1, n, m);
  }

  // Second Ways of find total ways of Grid;
  public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static int gridWaysSecondWay(int n, int m) {
    return factorial((n - 1) + (m - 1)) / (factorial(n - 1) * factorial(m - 1));
  }

  public static void main(String[] args) {
    int n = 3, m = 3;
    // System.out.println(gridWay(0, 0, n, m));
    System.out.println(gridWaysSecondWay(n, m));
  }
}
