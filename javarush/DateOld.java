package javarush;

import java.util.Date;

public class DateOld {
	public static void main(String[] args) throws Exception
	{
	    Date currentTime = new Date();           //�������� ������� ���� � �����
	    Thread.sleep(3000);                      //��� 3 ������� � 3000 �����������
	    Date newTime = new Date();               //�������� ����� ������� �����
	
	    long msDelay = newTime.getTime() - currentTime.getTime(); //��������� �������
	    System.out.println("Time distance is: " + msDelay + " in ms");
	}
}

