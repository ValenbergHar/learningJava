public class App56 {
    public static void main(String[] args) {
        doSomething(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("fori"+i);
                    }
                }
        );
        doSomething(()-> System.out.println("java"));
    }

    public static void doSomething(Runnable runnable) {
        runnable.run();
    }
}
