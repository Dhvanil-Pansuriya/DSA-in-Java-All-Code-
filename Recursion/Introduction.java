package Recursion;

public class Introduction {

  public static int factorial(int n) {
    if (n == 0) return 1;
    int fact = n * factorial(n - 1);
    return fact;
  }

  public static int sumOfNaturalNumber(int n) {
    if (n == 0) return 0;
    int fact = n + sumOfNaturalNumber(n - 1);
    return fact;
  }

  public static int fibonacci(int n) {
    if (n == 0 || n == 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    System.out.println(fibonacci(6));
  }
}
