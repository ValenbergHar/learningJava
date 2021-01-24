public class App1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new XRunnable());
        t.start();

        for(int i =0; i<100; i++){
            Thread.sleep(10);
            System.out.println("main: " +i);
        }
    }

    static class XRunnable implements Runnable{

        @Override
        public void run() {
            for(int i =0; i<100; i++){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("XRunnable: " +i);
            }
        }
    }
}
