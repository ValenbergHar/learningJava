package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Digdts {
	public static void main(String[] args) throws Exception {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String s = reader.readLine();
       int a = Integer.parseInt(s);
         int n = s.length();
        		if(a <= 999 && a >= 1) {
         if (a%2==0 && n==1){
             System.out.println("������ ����������� �����");
             }else if (a%2!=0 && n==1){
                 System.out.println("�������� ����������� �����");
             }else if (a%2==0 && n==2){
                 System.out.println("������ ���������� �����");
             }else if (a%2!=0 && n==2){
                 System.out.println("�������� ���������� �����");
             }else if (a%2==0 && n==3){
                 System.out.println("������ ����������� �����");
             }else  {
                 System.out.println("�������� ����������� �����");
             }  
        }
    }
}