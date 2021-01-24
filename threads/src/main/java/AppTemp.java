public class AppTemp {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int w=i+1;
            new Thread(()-> System.out.println(w)).start();
        }
        }
    }

