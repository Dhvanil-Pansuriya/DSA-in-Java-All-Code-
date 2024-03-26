public class TappingWater {

  public static void tappingWater(int arr[]) {
    int leftHeight[] = new int[arr.length];
    leftHeight[0] = arr[0];

    for (int i = 1; i < leftHeight.length; i++) {
      leftHeight[i] = Math.max(arr[i], leftHeight[i - 1]);
    }

    int rightHeight[] = new int[arr.length];
    rightHeight[arr.length - 1] = arr[arr.length - 1];

    for (int i = rightHeight.length - 2; i >= 0; i--) {
      rightHeight[i] = Math.max(arr[i], rightHeight[i + 1]);
    }

    int trappedWater = 0;

    for (int i = 0; i < arr.length; i++) {
      int waterLevel = Math.min(leftHeight[i], rightHeight[i]);
      trappedWater += waterLevel - arr[i];
    }

    System.out.println(trappedWater);
  }

  public static void main(String[] args) {
    int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
    tappingWater(arr);
  }
}
