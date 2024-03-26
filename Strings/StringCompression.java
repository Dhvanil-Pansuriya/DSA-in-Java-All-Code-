package Strings;

public class StringCompression {

  public static StringBuilder compression(String s) {
    StringBuilder str = new StringBuilder("");

    for (int i = 0; i < s.length(); i++) {
      Integer count = 1;
      while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
        i++;
        count++;
      }
      str.append(s.charAt(i));
      str.append(count.toString());
    }

    return str;
  }

  public static void main(String[] args) {
    String s = "aabb";
    System.out.println(compression(s));
  }
}
