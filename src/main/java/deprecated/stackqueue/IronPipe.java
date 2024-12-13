package deprecated.stackqueue;

import java.util.LinkedList;

public class IronPipe {
    private static final String LASER = "()";

    public int solution(String arrangement) {

        arrangement = arrangement.replace("()", "-");

        char[] pipeArray = arrangement.toCharArray();
        LinkedList<Character> pipeStack = new LinkedList<>();

        int laserCount = 0;
        int pieceCount = 0;

        for (int i = 0; i < pipeArray.length; i++) {
            if (pipeArray[i] == '(') {
                pipeStack.offerLast(pipeArray[i]);
            } else if (pipeArray[i] == '-') {
                pieceCount += pipeStack.size();
            } else if (pipeArray[i] == ')') {
                pipeStack.pollLast();
                pieceCount += 1;
            }
        }


        System.out.println(arrangement);
        int answer = 0;
        return answer;
    }
}
