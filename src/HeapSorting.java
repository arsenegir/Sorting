import java.util.ArrayList;
import java.util.List;

public class HeapSorting {
    public static List<Integer> sort(List<Integer> list) {
        int n = list.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(list, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);
            heap(list, i, 0);
        }

        return list;
    }

    private static void heap(List<Integer> list, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && list.get(left) > list.get(largest)) {
            largest = left;
        }

        if (right < n && list.get(right) > list.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            int swap = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, swap);
            heap(list, n, largest);
        }
    }
}
