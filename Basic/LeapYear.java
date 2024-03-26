public class LeapYear {

  public static void main(String[] args) {
    int a = 100;

    if (a % 100 == 0) {
      if (a % 400 == 0) {
        System.out.println("yes");
      } else {
        System.out.println("not");
      }
    } else if (a % 4 == 0) {
      System.out.println("yes");
    } else {
      System.out.println("not");
    }
  }
}
