package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Names {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s1 = reader.readLine();
      String s2 = reader.readLine();
      
      
      if (s1.equals(s2)){
          System.out.println("����� ���������");
      }else if (s1.length()==s2.length()){
           System.out.println("����� ���� �����");
      }else{}

    }
}