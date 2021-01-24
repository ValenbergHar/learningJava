public class AppSyncStatic {


    public static void main(String[] args) {
        AppSyncStatic e = new AppSyncStatic();
        new Thread(() -> classMethod()).start();
//        new Thread(() -> e.objectMethod()).start();
        new Thread(()->classMethod()).start();

    }

    private synchronized void objectMethod() {
        System.out.println("Sync Method Start");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Synch Method End");
    }

    private synchronized static void classMethod() {
        System.out.println("Sync Static Method Start");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Synch Static Method End");
    }

}
