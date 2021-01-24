public class AppDeamon {
    public static void main(String[] args) {
        Thread iTimer = new Thread(new Runnable() {
            @Override
            public void run() {
                int time  =0;
                while(true){
                    try {
                        Thread.sleep(1000);
                        time++;
                        System.out.println("time: "+time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        iTimer.setDaemon(true);
        iTimer.start();
        System.out.println("main->sleep");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main->end");
    }
}
