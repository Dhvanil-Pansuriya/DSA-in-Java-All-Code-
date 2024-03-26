import java.util.ArrayList;

public class TwoSum {

  public static boolean twoSumInRotatedArray(ArrayList<Integer> list, int key) {
    int maxEle = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      maxEle = Math.max(maxEle, list.get(i));
    }
    int pivot = list.indexOf(maxEle), i = pivot + 1, j = pivot, n = list.size();

    while (i != j) {
      if ((list.get(i) + list.get(j)) == key) {
        return true;
      } else if ((list.get(i) + list.get(j)) > key) {
        j = (n + j - 1) % n;
      } else if ((list.get(i) + list.get(j)) < key) {
        i = (i + 1) % n;
      }
    }

    return false;
  }
 
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);

    System.out.println(twoSumInRotatedArray(list, 16));
  }
}
