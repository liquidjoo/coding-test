package sort;

public class DesOrder {

    public String solution(String s) {
        char[] ch = s.toCharArray();
        sort(ch, 0, ch.length - 1);
        return String.valueOf(ch);
    }

    private void merge(char[] arr, int from, int mid, int to) {
        int i = from;
        int j = mid + 1;
        int k = from;
        char temp[] = new char[arr.length];

        while (i <= mid && j <= to) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= to) {
            temp[k++] = arr[j++];
        }

        for (int index = from; index < k; index++) {
            arr[index] = temp[index];
        }
    }

    private void sort(char[] arr, int from, int to) {
        if (from < to) {
            int mid = (from + to) / 2;
            sort(arr, from, mid);
            sort(arr, mid + 1, to);
            merge(arr, from, mid, to);
        }
    }

    private void merge(int[] arr, int from, int mid, int to) {
        int i = from;
        int j = mid + 1;
        int k = from;
        int temp[] = new int[arr.length];

        while (i <= mid && j <= to) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= to) {
            temp[k++] = arr[j++];
        }

        for (int index = from; index < k; index++) {
            arr[index] = temp[index];
        }
    }

    private void sort(int[] arr, int from, int to) {
        if (from < to) {
            int mid = (from + to) / 2;
            sort(arr, from, mid);
            sort(arr, mid + 1, to);
            merge(arr, from, mid, to);
        }
    }
}
