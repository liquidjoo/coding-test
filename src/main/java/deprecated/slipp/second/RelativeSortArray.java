package deprecated.slipp.second;

import java.util.*;

public class RelativeSortArray {


//    int[] a1 = {2,3,1,3,2,4,6,7,9,2,19};
//    int[] a2 = {2,1,4,3,9,6};
// arr2 기준
//        int[] result = new int[arr1.length];
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> remains = new ArrayList<>();

        for (final int pivot : arr2) {
            for (final int i : arr1) {
                if (pivot == i) {
                    result.add(i);
                }
            }
        }

        for (final int i : arr1) {
            if (!result.contains(i)) {
                remains.add(i);
            }
        }
        remains.sort(Comparator.naturalOrder());

        result.addAll(remains);

        return result.stream()
                .mapToInt(x -> x)
                .toArray();

    }
}
