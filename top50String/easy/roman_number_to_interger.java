import java.util.HashMap;


public class roman_number_to_interger {

  static int romanToDecimal(String s) {
    HashMap<Character, Integer> romanMap = new HashMap<>();
    romanMap.put('I', 1);
    romanMap.put('V', 5);
    romanMap.put('X', 10);
    romanMap.put('L', 50);
    romanMap.put('C', 100);
    romanMap.put('D', 500);
    romanMap.put('M', 1000);
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
      if (
        i + 1 < s.length() &&
        romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))
      ) {
        System.out.println(
          "Test 1 -" + s.charAt(i) + romanMap.get(s.charAt(i))
        );

        System.out.println(
          "Test 2-" + s.charAt(i + 1) + romanMap.get(s.charAt(i + 1))
        );

        res += romanMap.get(s.charAt(i + 1)) - romanMap.get(s.charAt(i));
        System.out.println(i);
        // MCMIV 
        //  index 1 vs index 2 => ok
        // jump index 3 no touch index 2 because index 2 has ben touched
// jump index 1 -> 3 
        i++;
        
      } else {
        res += romanMap.get(s.charAt(i));
        System.out.println("first " + s.charAt(i) + "=" + res);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    String s = "MCMIV";
    System.out.println(romanToDecimal(s));
  }
}
