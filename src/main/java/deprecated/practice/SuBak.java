package deprecated.practice;

public class SuBak {

    public String solution(int n) {
        return createSuBak(n);
    }

    private String createSuBak(int n) {
        StringBuilder words = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if ((i) % 2 == 0) {
                words.append("수");
            } else {
                words.append("박");
            }
        }
        return words.toString();
    }
}
