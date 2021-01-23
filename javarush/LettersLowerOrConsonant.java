package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LettersLowerOrConsonant {
    public static char[] vowels = new char[]{'�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String sG = "", sS = "";
         for ( int i = 0; i <s.length(); i ++) {
            if (isVowel(s.charAt(i))) {
                sG += s.charAt(i) + " ";
            }
            else {
                if (s.charAt(i)!=' ') {
                    sS += s.charAt(i) + " ";
                }
            }
        }
        System.out.println(sG);
        System.out.println(sS);
    }
        
    

    // ����� ���������, ������� �� �����
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // �������� ������ � ������ ������� - �� ��������� � �������� ������
        for (char d : vowels) {  // ���� ����� ������� �������
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}