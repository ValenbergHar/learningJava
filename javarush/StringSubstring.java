package javarush;
public class StringSubstring {
    public static void main(String[] args) {
        String s = "� �� ���� ������� Java, � ���� ������� ��������";
for (int i = 0; i < 5; i++) {
            System.out.println(s.substring(i, i+3));
        }
//����� substring() � Java ����� ��� �������� � ���������� ����� 
//������, ������� �������� ���������� ������ ������. ��������� 
//���������� � �������, ��������� ��������, � ������������ �� ����� 
//������ ������ ��� �� endIndex-1, ���� ������ ������ ��������. 
    }

}

