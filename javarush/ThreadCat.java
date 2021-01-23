package javarush;

//1. ���������, ��� ������ ���������.
//2. �������� ������ ������� join() ���, ����� ��� ������ ����� ����������� ���������:
//2.1. ������� ����� ������ �����.
//2.2. ����� ��� ������ ������� �� �������� � ������������ �������.
//2.3. � ����� ����� �������� �� ����� � ��������.
//2.4. ��� ������� ��� ����� ����� ����� ���� ���������� � ��������� ��� ������ �����.
//2.5. �������� ��� ����� (200 ��) � investigateWorld.

public class ThreadCat {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("�����");
        Cat cat2 = new Cat("�������");
    }

    private static void investigateWorld() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) throws InterruptedException {
            super(name);
            kitten1 = new Kitten("������� 1, ���� - " + getName());
            kitten2 = new Kitten("������� 2, ���� - " + getName());
            start();
        }

        public void run() {
            System.out.println(getName() + " ������ 2 �������");
            try {
                initAllKitten();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": ��� ������ � ��������. " + getName() + " ������� �� �����");
        }

        private void initAllKitten() throws InterruptedException {
            kitten1.start();
            kitten1.join();
            kitten2.start();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + ", ����� �� ��������");
            investigateWorld();
        }
    }
}
