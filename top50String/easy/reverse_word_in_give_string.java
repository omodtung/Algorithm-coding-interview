import java.util.ArrayList;
import java.util.List;

public class reverse_word_in_give_string {

  public static String reverseString(String data) {
    String[] parts = data.split("\\.");
    System.out.println("charArray" + parts);
    List<String> words_container = new ArrayList<>();

    for (String word : parts) {
      if (!word.isEmpty()) {
        System.out.println("cut split = " + word);
        words_container.add(word);
      }
    }
    words_container.reversed();

    return String.join(".", words_container);
  }

  

  public static void main(String[] args) {
    String str = "..onGo..for.geeks.";
    System.out.println(reverseString(str));
  }
}
