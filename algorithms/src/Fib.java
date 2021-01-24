import java.util.Arrays;

public class Fib {
    public static void main(String[] args) {
        /**
         * burbalka
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
         **/


        int i=100;
        long[] mem = new long[i+1];
        Arrays.fill(mem,-1);
        System.out.println(fib(i, mem));
        
        System.out.println(fibGol(100));
    }

    private static long fibGol(int k) {
        long result;
        if (k == 0) return 0;
        else if (k == 1) return 1;
        else {
            long tmp0 = fibGol(k - 2);
            long tmp1 = fibGol(k - 1);
            result = tmp0 + tmp1;
        }
        return result;
    }

    private static long fibEff(int i) {
        long[] arr = new long[i + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int j = 2; j <= i; j++) {
            arr[j] = arr[j - 1] + arr[j - 2];
        }
        return arr[i];
    }


    private static long fib(int i, long[] mem) {
        if (mem[i] != -1) return mem[i];
        if (i <= 1) return i;
        long result = fib(i - 1, mem) + fib(i - 2, mem);
        mem[i] = result;
        Arrays.sort(mem);
        return result;
    }

}
