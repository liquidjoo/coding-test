package deprecated.practice;

public class FindKim {

    private static final String KIM = "Kim";
    private static final String RETURN_VALUE = "김서방은 %s에 있다";

    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].contains(KIM)) {
                return String.format(RETURN_VALUE, i);
            }
        }
        return null;
    }
}
