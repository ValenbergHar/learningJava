import sort.BubbleSort;
import sort.InsertSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainAlgorythm {
    private static List<Integer> arrayList;

    public static void main(String[] args) {
       arrayList =  Arrays.asList(1,546,3,67,89,6,5,3,8,95);
        System.out.println("BubbleSort - " + BubbleSort.doSort(arrayList));
        System.out.println("****************************************");
        System.out.println("InsertSort - " +InsertSort.doSort(arrayList));
        System.out.println("****************************************");
    }
}
