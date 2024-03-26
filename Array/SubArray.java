public class SubArray {

  public static void subArray(int arr[]) {
    int maxSum = arr[0];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
          sum += arr[k];
          System.out.print(sum + " ");
          if (sum > maxSum) {
            maxSum = sum;
          }
        }
        System.out.println();
      }
    }
    System.out.println("\n= " + maxSum);
  }

  public static void subArrayPrefix(int arr[]) {
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];
    int sum = 0;

    int prefixSum = 0;
    for (int i = 0; i < prefix.length; i++) {
      prefix[i] = (prefixSum += arr[i]);
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        sum = prefix[j] - prefix[i];
        if (sum > maxSum) {
          maxSum = sum;
        }
      }
    }
    System.out.println(maxSum);
  }

  public static void maxSubArrayKadanes(int arr[]) {
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for (int i = 0; i < arr.length; i++) {
      cs = cs + arr[i];
      if (cs < 0) {
        cs = 0;
      }
      ms = Math.max(cs, ms);
    }
    System.out.println(ms);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };
    subArrayPrefix(arr);
  }
}
