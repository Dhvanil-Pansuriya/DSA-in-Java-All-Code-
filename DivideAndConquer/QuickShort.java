package DivideAndConquer;

public class QuickShort {

  public static void display(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void quickShort(int arr[], int sp, int ep) {
    if (sp >= ep) {
      return;
    }
    int ind = partitions(arr, sp, ep);
    quickShort(arr, sp, ind - 1);
    quickShort(arr, ind + 1, ep);
  }

  public static int partitions(int arr[], int sp, int ep) {
    int pivot = arr[ep];
    int i = sp - 1;

    for (int j = sp; j < ep; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }

    i++;
    int temp = pivot;
    arr[ep] = arr[i];
    arr[i] = temp;

    return i;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 6, 2, 8, 4, 9, 1 };
    quickShort(arr, 0, arr.length - 1);
    display(arr);
  }
}
