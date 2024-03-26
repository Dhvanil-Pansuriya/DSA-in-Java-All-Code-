package DivideAndConquer;

public class MergeShort {

  public static void display(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void mergeShort(int arr[], int sp, int ep) {
    if (sp >= ep) {
      return;
    }
    int mid = sp + (ep - sp) / 2;
    mergeShort(arr, 0, mid);
    mergeShort(arr, mid + 1, ep);
    merge(arr, sp, mid, ep);
  }

  public static void merge(int arr[], int sp, int mid, int ep) {
    int temp[] = new int[ep - sp + 1];
    int i = sp;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= ep) {
      if (arr[i] < arr[j]) {
        temp[k++] = arr[i++];
      } else {
        temp[k++] = arr[j++];
      }
    }
    while (i <= mid) {
      temp[k++] = arr[i++];
    }
    while (j <= ep) {
      temp[k++] = arr[j++];
    }

    for (k = 0, i = sp; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }
  }

  public static void main(String[] args) {
    int arr[] = { 3, 6, 2, 8, 4, 9, 1 };
    mergeShort(arr, 0, arr.length - 1);
    display(arr);
  }
}
