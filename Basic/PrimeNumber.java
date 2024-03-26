public class PrimeNumber {

  public static void main(String[] args) {
    int a = 13;
    int x = 0;
    for (int i = 2; i < a - 1; i++) {
      if (a % i == 0) {
        x++;
      }
    }
    if (x == 0) {
      System.out.println("y");
    } else {
      System.out.println("n");
    }
  }
}
