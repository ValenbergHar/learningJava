public class Solution {
    private String name;

    Solution(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    private void sout() {
        new Solution("Лукашенко А.Г.") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Solution("Жыве Беларусь!").sout();
    }
}