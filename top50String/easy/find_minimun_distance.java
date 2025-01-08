import java.util.ArrayList;

public class find_minimun_distance {

  // Find the minimum distance between the given two words

  static int shortestDistance(String[] s, String word1, String word2) {
    // code here
    int word1_index = -1;
    int word2_index = -2;
    int ans = Integer.MAX_VALUE;
    for (int i = 0; i < s.length; i++) {
      if (s[i] == word1) {
        word1_index = i;
      }
      if (s[i] == word2) {
        word2_index = i;
      }
      if (word1_index != -1 && word2_index != -1) {
        ans = Math.abs(word2_index - word1_index);
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    String[] S = { "the", "quick", "brown", "fox", "quick" };

    String word1 = "the", word2 = "fox";

    // Function Call
    System.out.println(shortestDistance(S, word1, word2));
  }
}
