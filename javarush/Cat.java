package javarush;
public class Cat extends Animal {

   String tail = "����������� �������� tail � ������ Cat";

   static int catsCount = 37;

   public Cat(String brain, String heart, String tail) {
       super(brain, heart);
       System.out.println("����������� ������ Cat ����� ������ (����������� Animal ��� ��� ��������)");
       System.out.println("������� �������� ����������� ���������� catsCount = " + catsCount);
       System.out.println("������� �������� ����������� ���������� catsCount = " + animalCount);
       System.out.println("������� �������� tail = " + this.tail);
       this.tail = tail;
       System.out.println("������� �������� tail = " + this.tail);
   }

   public static void main(String[] args) {
       Cat cat = new Cat("����", "������", "�����");
   }
}