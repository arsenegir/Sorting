import java.util.ArrayList;
import java.util.List;

public class ByBaseSorting {
    public static List<Integer> sort(List<Integer> list) {
        int max = getMax(list);

        for (int place = 1; max / place > 0; place *= 10) {
            list = countingSort(list, place);
        }

        return list;
    }

    private static List<Integer> countingSort(List<Integer> list, int place) {
        int[] count = new int[10];
        ArrayList<Integer> output = new ArrayList<>(list.size());

        for (int i = 0; i < list.size(); i++) {
            int digit = (list.get(i) / place) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            int digit = (list.get(i) / place) % 10;
            output.set(count[digit] - 2, list.get(i-1));
            count[digit]--;
        }

        return output;
    }

    private static int getMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
