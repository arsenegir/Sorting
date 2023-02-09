import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers = fillWithRandom(integers,10,8,0);

        System.out.println("Before: "+integers.toString());

        //integers = MergeSorting.sort(integers); //does work
        //integers = BublleSorting.sort(integers); //does work
        integers = QuickSorting.sort(integers,integers.get(9),integers.get(0)); //bogus
        //integers = BublleSorting.sort(integers); // does work
        //integers = HeapSorting.sort(integers); //does work
        //integers = ByBaseSorting.sort(integers); //bogus

        System.out.println("After: "+integers.toString());
    }

    public static List<Integer> fillWithRandom(List<Integer> list,int length,int max,int min){
        for (int i = 0;i<length;i++){
            list.add(new Random().nextInt(max - min) + min);
        }
        return list;
    }
}