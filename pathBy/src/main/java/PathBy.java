import java.util.Arrays;

public class PathBy {
    public static void main(String[] args) {
        pathByValue();
        pathByLink();
        pathByLinkNull();
    }

    private static void pathByLinkNull() {
        int[] x = {1,2,3};
        int[] y = x;
        x = null;
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

    }

    private static void pathByLink() {
        int[] x = {1,2,3};
        int[] y = x;
        x[0] = 5;
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.toString(x));
    }

    private static void pathByValue() {
        int x = 1;
        int y = x;
        x = 0;
        System.out.println(y);
    }
}
