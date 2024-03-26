/**
 * A
 */
public class ReverseNumber {

  public static void main(String[] args) {
    int a = 10002;
    while (a > 0) {
      int x = a % 10;
      System.out.print(x);
      a /= 10;
    }
  }
}
