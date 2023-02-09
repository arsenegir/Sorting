import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers = fillWithRandom(integers,1000,8,0);

        System.out.println("Before: "+integers.toString());

        integers = MergeSorting.sort(integers);
        //integers = BublleSorting.sort(integers);
        //integers = QuickSorting.sort(integers,integers.get(9),integers.get(0));
        //integers = BublleSorting.sort(integers);
        //integers = HeapSorting.sort(integers);
        //integers = ByBaseSorting.sort(integers); not working yet

        System.out.println("After: "+integers.toString());
    }

    public static List<Integer> fillWithRandom(List<Integer> list,int length,int max,int min){
        for (int i = 0;i<length;i++){
            list.add(Integer.valueOf(new Random().nextInt(max-min)+min));
        }
        return list;
    }
}