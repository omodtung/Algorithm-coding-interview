import java.util.HashMap;

public class Isomorphic_Strings_Check {

  public static boolean Isomorphic_Strings_Check(String s1, String s2) {
    if (s1.length() != s2.length()) return false;

    HashMap<Character, Integer> map_1 = new HashMap<>();
    HashMap<Character, Integer> map_2 = new HashMap<>();

    for (int i = 0; i < s1.length(); i++) {
      if (!map_1.containsKey(s1.charAt(i))) map_1.put(s1.charAt(i), i);
      if (!map_2.containsKey(s1.charAt(i))) map_2.put(s2.charAt(i), i);
      if (
        !map_1.get(s1.charAt(i)).equals(map_2.get(s2.charAt(i)))
      ) return false;
    }

    return true;
  }
}

// A B C
// A A C

// A =0 A=0

// B =1 A=?

