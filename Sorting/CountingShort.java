public class CountingShort {

  public static void countingShort(int arr[]) {
    int largest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }

    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 5, 3, 2, 5, 7, 4 };
    countingShort(arr);

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
  }
}
