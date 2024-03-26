public class SubsetOfString {

    public static void subString(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        subString(str, ans+str.charAt(i), i+1);
        subString(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        subString(str, ans, 0);
    
    }
}