import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//https://youtu.be/9fwwnG_HPRE?t=19690
public class Main {
    static List<Integer> c1 = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        for (int i = 0; i < 20000; i++) {
            c1.add(i);
        }

        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Long> f1= pool.submit(()->{
            long start=System.currentTimeMillis();
            long n=0;
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i <c1.size()/2 ; i++) {
                n+=c1.get(i);
            }
            System.out.println("---end--- "+ Thread.currentThread().getName() + " "+ n);
            return System.currentTimeMillis()-start;
        });
        Future<Long> f2= pool.submit(()->{
            long start=System.currentTimeMillis();
            long n=0;
            System.out.println(Thread.currentThread().getName());
            for (int i = c1.size()/2; i <c1.size()-1; i++) {
                n+=c1.get(i);
            }
            System.out.println("---end--- "+ Thread.currentThread().getName() + " "+ n);
            return System.currentTimeMillis()-start;
        });

        try {
            long r1=f1.get();
            System.out.println(r1);
            long r2=f1.get();
            System.out.println(r2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        pool.shutdown();
        System.out.println("----after-----");
    }
}
