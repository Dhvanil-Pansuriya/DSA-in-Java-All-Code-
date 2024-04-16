package StackDataStructure;

import java.util.Stack;

public class ReverseString {

  public static String reverseString(Stack<Character> s, String str) {
    for (int i = 0; i < str.length(); i++) {
      s.push(str.charAt(i));
    }
    String newStr = "";
    while (!s.isEmpty()) {
      char y = s.pop();
      newStr += y;
    }
    return newStr;
  }

  public static void main(String[] args) {
    Stack<Character> s = new Stack<>();
    System.out.println(reverseString(s, "Dhvanil"));
  }
}
