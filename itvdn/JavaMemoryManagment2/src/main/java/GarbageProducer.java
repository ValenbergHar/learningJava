import java.util.ArrayList;
import java.util.List;

public class GarbageProducer {
    static List<Object> l;

    public static void main(String... args) throws InterruptedException {
         Thread.sleep(30000);

        l = new ArrayList<Object>();
        for (int c = 0; c < 100000000; c++) {
            l.add(new Object());
        }
    }
}
