package javarush;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileInputStream = null;
        OutputStream fileOutputStream = null;
        try {

            String sourceFileName = reader.readLine();
            String destinationFileName = reader.readLine();

            fileInputStream = getInputStream(sourceFileName);
            fileOutputStream = getOutputStream(destinationFileName);

        } catch (FileNotFoundException e) {
            System.out.println("���� �� ����������.");
        }
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

//������: ��������� ������ ��� ����� �����. � �������� ������ ���� �� �����, 
//�������� ������ ������.
//����� ������: ��������� ������ ��� ����� �����. � �������� ������ ���� �� �����, 
//�������� ������ ������.
//���� ����� (������� ����� ����������) � ��������� ������ �� ����������, �� ��������� ������ 
//������� ������� "���� �� ����������." � ��� ���� ��� ��������� ��� ����� � �������,
//� ��� ����� ��������� ���� ��� ������.

