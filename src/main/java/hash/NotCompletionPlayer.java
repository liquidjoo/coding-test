package hash;

import java.util.*;

public class NotCompletionPlayer {

    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> result = new HashMap<>();

        for (final String player : participant) {
            result.put(player, result.getOrDefault(player, 0) + 1);
        }

        for (final String player : completion) {
            result.put(player, result.get(player) - 1);
        }

        for (final Map.Entry<String, Integer> element : result.entrySet()) {
            if (element.getValue() != 0) {
                return element.getKey();
            }
        }

        return null;
    }
}
