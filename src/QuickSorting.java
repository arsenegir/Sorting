import java.util.ArrayList;
import java.util.List;

public class QuickSorting {

    public static List<Integer> sort(List<Integer> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            sort(list, low, pivotIndex - 1);
            sort(list, pivotIndex + 1, high);
        }
        return list;
    }

    private static int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
        return i + 1;
    }
}
