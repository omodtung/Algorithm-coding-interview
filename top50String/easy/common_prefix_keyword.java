import java.util.Arrays;

public class common_prefix_keyword {

  static String longestCommonPrefix(String[] arr) {
    Arrays.sort(arr);   
    String first = arr[0];
    String second = arr[arr.length - 1];
    int Min_length = Math.min(first.length(), second.length());
    int set_range = 0;
    for (int i = 0; i <= Min_length-1; i++) {
      if (first.charAt(i) == second.charAt(i)) {
        set_range++;
      }
    }

    return first.substring(0, set_range);
  }

  public static void main(String[] args) {
    String[] arr = { "geeksforgeeks", "geeks", "geek", "geezer" };
    System.out.println(longestCommonPrefix(arr));
  }
}
