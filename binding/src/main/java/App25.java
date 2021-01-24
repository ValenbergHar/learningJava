public class App25 {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("block");
    }

    public App25 () {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        App25 app25 = new App25();
    }
}
