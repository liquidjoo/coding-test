package slipp.second;

import java.util.Arrays;

public class FindReplaceString {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {

        String[] replacedWord = new String[indexes.length];

        for (int i = 0; i < indexes.length; i++) {
            replacedWord[i] = String.valueOf(S.charAt(indexes[i]));
        }

        for (int i = 0; i < sources.length; i++) {
            if (sources[i].contains(replacedWord[i]) && S.contains(sources[i])) {
                S = S.replace(sources[i], targets[i]);
            }
        }

        return S;
    }
}
