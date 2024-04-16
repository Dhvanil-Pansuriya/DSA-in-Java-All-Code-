package StackDataStructure;

import java.util.Stack;

public class ReverseStringUsingStack {

  public static String reverseString(String str) {
    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
        s.push(str.charAt(i));
    }

    String newString= "";

    while (!s.isEmpty()) {
        newString+=s.pop();
    }

    return newString;
  }

  public static void main(String[] args) {
    String s = "abc";
    System.out.println(reverseString(s));
  }
}
