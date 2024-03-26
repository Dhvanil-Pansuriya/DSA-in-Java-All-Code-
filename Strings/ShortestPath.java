package Strings;

public class ShortestPath {

  public static void shortestPathOfDirection(String str) {
    int x = 0, y = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'N') {
        y++;
      } else if (str.charAt(i) == 'S') {
        y--;
      } else if (str.charAt(i) == 'E') {
        x++;
      } else if (str.charAt(i) == 'W') {
        x--;
      }
    }

    int sqrtX= x*x; 
    int sqrtY= y*y; 

    int sqrtSum = sqrtX + sqrtY;

    double ans = Math.sqrt(sqrtSum);

    System.out.println(x + " " + y + " Ans is : " + ans);
  }

  public static void main(String[] args) {
    String s = new String("WNEENESENNN");

    shortestPathOfDirection(s);
  }
}
