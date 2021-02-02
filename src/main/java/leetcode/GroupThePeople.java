package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeople {

    public static void main(String ... args) {
        GroupThePeople groupThePeople = new GroupThePeople();

        int[] request = {3,3,3,3,3,1,3};
        groupThePeople.groupThePeople(request);
    }


    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> group = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {

            if (!group.containsKey(groupSizes[i])) {
                group.put(groupSizes[i], new ArrayList<>());
            }

            List<Integer> value = group.get(groupSizes[i]);
            value.add(i);

            if (value.size() == groupSizes[i]) {
                result.add(new ArrayList<>(value));
                value.clear();
            }

        }
        return result;
    }
}
