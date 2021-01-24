import sun.plugin.javascript.navig.Array;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Ў".getBytes(StandardCharsets.UTF_8).length);
        System.out.println("AA".getBytes(StandardCharsets.UTF_16).length);
        System.out.println(Arrays.toString("z".getBytes(StandardCharsets.UTF_16)));
        char c0 =65_535;
        char c1 =0x000;
        char c2 =0xFFFF;
        char c3 ='g';
String str = "\u0A0C";
        int d =1118;
        System.out.println(str);
        System.out.println((char) d);
        System.out.println((int) c3);

    }
}
