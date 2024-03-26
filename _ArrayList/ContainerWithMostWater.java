public class ContainerWithMostWater {

  public static int findWater(int arr[]) {
    int water = 0, h = 0, l = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        h = Math.min(arr[i], arr[j]);
        l = j - i;
        int currentWater = h * l;
        water = Math.max(water, currentWater);
      }
    }
    return water;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(findWater(arr));
  }
}
