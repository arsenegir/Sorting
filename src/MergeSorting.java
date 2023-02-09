import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeSorting {

    public static List<Integer> sort(List<Integer> arrayList) {
        LinkedList<Integer> list = new LinkedList<>();


        if (arrayList == null) {
            return null;
        }else {
            list.addAll(arrayList);
        }

        return sort(list, 0, list.size() - 1);
    }

    private static List<Integer> sort(List<Integer> list, int start, int end) {
        if (start >= end) {
            List<Integer> result = new ArrayList<>();
            result.add(list.get(start));
            return result;
        }

        int mid = (start + end) / 2;
        List<Integer> left = sort(list, start, mid);
        List<Integer> right = sort(list, mid + 1, end);
        return merge(left, right);
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>(left.size() + right.size());
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) <= right.get(rightIndex)) {
                result.add(left.get(leftIndex++));
            } else {
                result.add(right.get(rightIndex++));
            }
        }

        while (leftIndex < left.size()) {
            result.add(left.get(leftIndex++));
        }
        while (rightIndex < right.size()) {
            result.add(right.get(rightIndex++));
        }

        return result;
    }

}
