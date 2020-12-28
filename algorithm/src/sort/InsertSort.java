package sort;

import java.util.ArrayList;
import java.util.List;

public class InsertSort {
    public static List doSort(List<Integer> arrayList) {

        for (int i = 1; i < arrayList.size(); i++) {
            int tmp = arrayList.get(i);
            int j = i - 1;
            while (j >= 0 && tmp < arrayList.get(j)) {
                arrayList.set(j + 1, arrayList.get(j));
                j--;
            }
            arrayList.set(j + 1, tmp);
        }
        return arrayList;
    }
}
