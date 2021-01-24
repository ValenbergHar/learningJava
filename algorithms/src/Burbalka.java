import java.util.Arrays;

public class Burbalka {
    public static void main(String[] args) {
        int[] arr = {54,48,1,100,85};
        for (int N = 0; N <arr.length ; N++) {
            for (int i = 0; i <arr.length-1 ; i++) {
                if(arr[i]>arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
