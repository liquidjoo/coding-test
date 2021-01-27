package slipp.week13;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateLetters {

    public static void main(String[] args) {

        RemoveDuplicateLetters removeDuplicateLetters = new RemoveDuplicateLetters();
        final String s = removeDuplicateLetters.removeDuplicateLetters("cbacdcbc");
        System.out.println(s);
    }

    public String removeDuplicateLetters(String s) {
        Set<String> words = new HashSet<>();

        for (final char c : s.toCharArray()) {
            words.add(String.valueOf(c));
        }

        return String.join("", words);
    }
}
