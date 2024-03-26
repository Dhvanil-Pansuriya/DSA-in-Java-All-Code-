package Bit_Manipulation;

public class BitOperation {

  public static int getIthBit(int n, int i) {
    int bit = 1 << i;
    if ((n & bit) == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  public static int setIthBit(int n, int i) {
    int bit = 1 << i;
    return n | bit;
  }
  public static int clearIthBit(int n, int i) {
    int bit = ~(1 << i);
    return n & bit;
  }

  public static void main(String[] args) {
    System.out.println(clearIthBit(10, 1));
  }
}
