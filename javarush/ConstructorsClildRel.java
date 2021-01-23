package javarush;

//1.������������������� ����������� ���������� ������ Car
//2.����� ������������� ����������� ���������� ������-������ 
//���������������� ����������� ���������� ������-�������.
//3.�������� �� ����� ����� ���������������� ������������� ���������� ������-������.
//4.�������, ���� ����� �� �������������! ������, �� ������������ �������� ������. 
//������ ��� ������ � ��������� ����� � �������� �������� �������.
//5.������������� ������������� ����� ������-�������,



//1 - ������ ��������
//2 - ������ ������� 
//3 - �� ������ ��������
//4 - ����������� ��������
//5 - �� ������ �������
//6 - ����������� �������


import java.io.IOException;

public class ConstructorsClildRel {
	public static class Car {

		   public static int carCounter = 10;

		   private String description = "��������� �������� ���� description";

		   public Car() {
		       System.out.println(carCounter);
		       
		       System.out.println(description);
		       description = "����������� ������";
		       System.out.println(description);
		       
		       System.out.println("������ �� ������������ Car!");
		   }

		   public String getDescription() {
		       return description;
		   }
		}

		public static class Truck extends Car {

		   private static int truckCount = 10000;
		   static {System.out.println(carCounter);}

		   private int yearOfManufacture;
		   private String model;
		   private int maxSpeed = 150;

		   public Truck(int yearOfManufacture, String model, int maxSpeed) {
			   //System.out.println(carCounter);
			   System.out.println("������ �� ������������ Truck!");
			   System.out.println("����������� �������� maxSpeed = " + this.maxSpeed);
			   
		       this.yearOfManufacture = yearOfManufacture;
		       this.model = model;
		       this.maxSpeed = maxSpeed;

		       Car.carCounter++;
		       truckCount++;
		   }
		}

   public static void main(String[] args) throws IOException {

       Truck truck = new Truck(2017, "Scania S 500 4x2", 220);
   }
}