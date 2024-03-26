import java.util.ArrayList;

public class MultidimensionalArrayList {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> main = new ArrayList<>();

    ArrayList<Integer> first = new ArrayList<>();
    first.add(1);
    first.add(2);
    main.add(first); 
    
    ArrayList<Integer> second = new ArrayList<>();
    second.add(1);
    second.add(2);
    main.add(second);

    for (int i = 0; i < main.size(); i++) {
        ArrayList<Integer> current = main.get(i);
        for (int j = 0; j < current.size(); j++) {
            System.out.println(current.get(j));
        }
    }
  }
}
