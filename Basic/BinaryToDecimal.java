public class BinaryToDecimal {

  public static void binaryToDecimalNumber(int n) {
    int x = 0;
    int pow = 0;
    while (n > 0) {
      int reminder = n % 2;
      x += (reminder * (Math.pow(10, pow)));
      pow++;
      n /= 2;
    }
    System.out.println(x);
  }

  public static void main(String[] args) {
    binaryToDecimalNumber(6);
  }
}
