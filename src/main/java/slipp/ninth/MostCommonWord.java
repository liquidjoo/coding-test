package slipp.ninth;

import java.util.*;
import java.util.stream.Collectors;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
        paragraph = paragraph.replaceAll(match, " ");
        final String[] words = paragraph.split(" ");


        Map<String, Integer> dictionary = new HashMap<>();
        for (final String rawWord : words) {
            String word = rawWord.trim().toLowerCase();
            if (!word.isEmpty()) {
                dictionary.put(word, dictionary.getOrDefault(word, 0) + 1);
            }
        }

        for (final String ban : banned) {
            dictionary.remove(ban);
        }

        return dictionary.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .get()
                .getKey();
    }
}
