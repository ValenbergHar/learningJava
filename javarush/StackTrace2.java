package javarush;
public class StackTrace2 {
    public static void main(String[] args) {
        method1();
    }

    public static String method1()
    {
        method2();
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[0].getMethodName();
        
        return name;
    }

    public static String method2()
    {
        method3();
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        
        return name;
    }

    public static String method3()
    {
        method4();
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        
        return name;
    }

    public static String method4()
    {
        method5();
        //        �������� ��� ��� ���
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        
        return name;
    }

    public static String method5()
    {
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            String name = stackTraceElements[2].getMethodName();
        
        return name;


    }
}

//[2] ������ ���:
//[0] - �����
//[1] - ��� �����
//[2] - ����� ��������� ����� � �������� [1]
//[3] - ����� ��������� ����� � �������� [2], ������� ������ ����� � �������� [1] � �.�.


//��� ���, ��� ��� � � � ������ ������ �� �����=)
//StackTrace ����� ��� ����������� ������ � ����.
//��������� � ������� �� �������� StackTrace � �������� �� �����������:
//StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//
//*StackTraceElement[]* - �������� �� ��� �������(������� ����� �� ��� ��������� ������� ���� int[], 
//		String[], ��� ��� ���� ����� ).
//*stackTraceElements* - ��� �������, ����� ���� ����� � ������ ����� ������ ������������ �� ������ 
//��� �� ������ (� ������ ������ ������� �����, �� ������������� �������� ������ $ and ~ � �.�.)
//*Thread.currentThread()* - ��������� ������ �� ������� �����, � ������� ����������� ������, ������� 
//�� ����� ���������(�� �����, ��� ��� ����� �� ������ �����, ������ ����� ���������, ��� �������)
//*getStackTrace()* - �������� ���� ���� ���������� �������(����������, �� �����, ��� ��� ����� �� 
//		������ �����, ������ ����� ���������, ��� �������)
//
//����� ���������� ���� ������ � ��� �������� ������ ���� StackTraceElement[] � ������ StackTraceElement, 
//������� ��������� �� ��� ����������, ���� �� �������� ��� � ������ main - 0 ��������� ����� ��� StackTrace, 
//� 1 ��������� ����� ����. ��������� ������ ����� ������� ��� ��� �� ���������� ���������. 
//��� ��������� ���� ����� ����� ��� ������ ������� .getClassName() � .getMethodName() 
//(� ��� � �������� � ������ ����)���������� � ����������� � ������ �������, �� ��� �������.
//������ ���������, ��� ��� ����� ���� ������� ��������� ������. �� ��������, ��� � ������� 
//�������� ���� � ����������� �������. ��� ������ ����������� StackTrace[0].getClassName() 
//�� ������ � ����� ������ ��� �������, � ��� ������ StackTrace[0].getMethodName() �� �������
//��� ������, ����������� � 0 ������� StackTrace � �� ������� getStackTrace. ���� � ������ 
//������ ��� ��������� �������, �������� StackTrace[0].getLineNumber() ��� ��������� ������
//������ ������, ������ �� ������� �������� � ������� �������� �������.