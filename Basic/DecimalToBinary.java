/**
 * DecimalToBinary
 * 
 */
public class DecimalToBinary {

  public static int decimalToBinary(int n) {
    int decimal = 0;
    int pow = 0;
    int ld = 0;
    while (n > 0) {
      ld = n % 10;
      decimal += (ld * Math.pow(2, pow));
      pow++;
      n = n / 10;
    }
    return decimal;
  }

  public static void main(String[] args) {
    int a = 1001000;
    System.out.println(decimalToBinary(a));
  }
}
