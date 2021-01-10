package slipp;

public class MinimumSwaps2 {

    public int solve(int[] arr) {
        int count = 0;
        int pivot = 0;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                for (int i = index + 1; i < arr.length ; i++) {
                    if (arr[i] == index + 1) {
                        pivot = i;
                        break;
                    }
                }
                int temp = arr[index];
                arr[index] = arr[pivot];
                arr[pivot] = temp;
                count++;
            }
        }

        return count;
    }


}
