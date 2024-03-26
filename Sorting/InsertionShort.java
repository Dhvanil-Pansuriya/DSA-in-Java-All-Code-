public class InsertionShort {

  public static void main(String[] args) {
    int arr[] = { 5, 3, 3, 7, 9, 5, 3, 1 };

    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int prev = i - 1;

      while (curr < arr[prev] && prev >= 0) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      arr[prev + 1] = curr;
    }

    for (int i : arr) {
      System.out.println(i);
    }
  }
}
