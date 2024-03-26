public class Pattern {

  public static void numberPyramid(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void palindromePyramid(int n) {
    for (int i = 1; i < n + 1; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j < (i * 2); j++) {
        if (i == j) {
          System.out.print("1 ");
        } else if (i > j) {
          System.out.print(((i - j) + 1) + " ");
        } else {
          System.out.print(((j - i) + 1) + " ");
        }
      }

      System.out.println();
    }
  }

  public static void characterPattern(char c) {
    int n = (int) c;
    for (int i = 65; i < n + 1; i++) {
      for (int j = 65; j < i + 1; j++) {
        System.out.print((char) i + " ");
      }
      System.out.println();
    }
  }

  public void hollowRectangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == n || j == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void nitin(int n) {
    for (int i = 1; i <= n; i++) {
      // for (int j = 1; j <= n ; j++) {
      //   if ((i+j) > n) {
      //     System.out.print("* ");
      //   }else{
      //     System.out.print("  ");
      //   }
      // }

      for (int j = 1; j <= n - i; j++) {
        System.out.print("- ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }

  public static void butterFlyPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      for (int j = i; j < n; j++) {
        System.out.print("  ");
      }
      for (int j = i; j < n; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      for (int j = i; j < n; j++) {
        System.out.print("  ");
      }
      for (int j = i; j < n; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    // for (int i = 1; i <= n; i++) {
    //   for (int j = i; j <= n; j++) {
    //     System.out.print("* ");
    //   }
    //   for (int j = 1; j < i; j++) {
    //     System.out.print("  ");
    //   }
    //   for (int j = 1; j < i; j++) {
    //     System.out.print("  ");
    //   }
    //   for (int j = i; j <= n; j++) {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }
  }

  public static void solidRhombusPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == n || j == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void diamondPattern(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j < 2 * i ; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    for (int i = n; i >= 1; i--) {
      for (int j = i; j <= n; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j < 2*i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    numberPyramid(5);
  }
}
