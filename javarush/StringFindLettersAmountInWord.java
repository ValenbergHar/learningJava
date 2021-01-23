package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//������ � ���������� 10 ������� 
//� ���������� � ��� ���������� ��������� 
//���� (��� 33 ��������� ���� ��������). 
//��������� ������� �� ����� � ���������� �������.

public class StringFindLettersAmountInWord {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // �������
        List<Character> alphabet = Arrays.asList(
                '�','�','�','�','�','�','�','�',
                '�','�','�','�','�','�','�','�',
                '�','�','�','�','�','�','�','�',
                '�','�','�','�','�','�','�','�','�');

        // ���� �����
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
int  count=0;
         for (char abs : alphabet) {
            for (String lonelyString : list) {
                for (char symbol : lonelyString.toCharArray()) {
                    if(abs == symbol)
                        count++;
//                    � ��� ���� ������ "ABC". � ������� ������ toCharArray() 
                 //   �� �������� ��� ������ � ������ ����� {'A', 'B', 'C'}.
                }
            }
            System.out.println(abs + " " + count);
            count = 0;
        }
    }
}
