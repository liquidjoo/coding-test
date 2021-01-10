package stackqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

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
