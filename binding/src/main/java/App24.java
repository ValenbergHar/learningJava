public class App24 {
    private String name;

    App24(String name) {
        this.name = name;
    }

//    private String getName() {
//        return name;
//    }


    public String getName() {
        return name;
    }

    private void sout() {
        new App24("sout") {
            void printName() {
                System.out.println(getName());//А если без расширения метода? то: super.getName() !!!
            }
        }.printName();
    }

    public static void main(String[] args) {
        new App24("main").sout();
    }
}