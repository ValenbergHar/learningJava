package javarush;
public class Animal {

   String brain = "����������� �������� brain � ������ Animal";
   String heart = "����������� �������� heart � ������ Animal";

   public static int animalCount = 7700000;

   public Animal(String brain, String heart) {
       System.out.println("����������� ����������� �������� ������ Animal");
       System.out.println("���� �� ��� ������������������� ���������� ������ Animal?");
       System.out.println("������� �������� ����������� ���������� animalCount = " + animalCount);
       System.out.println("������� �������� brain � ������ Animal = " + this.brain);
       System.out.println("������� �������� heart � ������ Animal = " + this.heart);
       System.out.println("���� �� ��� ������������������� ���������� ������ Cat?");
       System.out.println("������� �������� ����������� ���������� catsCount = " + Cat.catsCount);

       this.brain = brain;
       this.heart = heart;
       System.out.println("����������� �������� ������ Animal �������� ������!");
       System.out.println("������� �������� brain = " + this.brain);
       System.out.println("������� �������� heart = " + this.heart);
   }
}

