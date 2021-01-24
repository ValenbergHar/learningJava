public class AppInterr {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean inter = false;
                while (true){
                    if(Thread.currentThread().isInterrupted()|| inter){
                        System.out.println("interrupted");
                        break;
                    }
                    System.out.println("tick");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        inter=true;
                    }
                }
            }
        });
        t.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t.interrupt();
    }
}
