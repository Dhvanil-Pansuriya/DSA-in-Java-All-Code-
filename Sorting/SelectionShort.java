public class SelectionShort {

  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 3, 2, 1, 2 };

    for (int i = 0; i < arr.length - 1; i++) {
      int cp = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[cp]) {
          cp = j;
        }
      }
      int temp = arr[cp];
      arr[cp] = arr[i];
      arr[i] = temp;
    }

    for (int i : arr) {
        System.out.println(i);
    }
  }
}
