package sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static List doSort(List<Integer> list){
        int i, j, buf;
        j = list.size();
        while (j > 1)
        {
            for (i = 0; i <= j-2; i++)
            {
                if (list.get(i) > list.get(i+1))
                {
                    buf = list.get(i+1);
                    list.set(i+1, list.get(i));
                    list.set(i, buf);
                }
            }
            j--;
        }
        return list;
    }
}
