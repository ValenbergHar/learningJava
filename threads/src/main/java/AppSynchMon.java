import java.io.ObjectInput;

public class AppSynchMon {
    private Object monitor = new Object();

    public static void main(String[] args) {
        AppSynchMon e2 = new AppSynchMon();
        new Thread(() -> e2.method()).start();
        new Thread(() -> e2.method()).start();
        new Thread(() -> e2.method()).start();
    }

    private void method() {
        try {
            System.out.println("nonSynch-Begin " + Thread.currentThread().getName());
            for (int i = 0; i < 3; i++) {
                System.out.println('.');
                Thread.sleep(200);
            }

            System.out.println("nonSynch-End " + Thread.currentThread().getName());
            synchronized (monitor) {
                System.out.println("Synch-Begin " + Thread.currentThread().getName());

                for (int i = 0; i < 5; i++) {
                    System.out.println('_');
                    Thread.sleep(200);
                }
                System.out.println("Synch-End " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

