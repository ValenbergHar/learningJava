package javarush;
class A{

    A(){
        System.out.println("����������� ��� ���������� ������ A");
    }

    A(String args){
        System.out.println("����������� � ����� ���������� ������ A");
    }
}

class B extends A{

   B(){
        this(""); // ����� ������������ � ����� ���������� ������ B
        System.out.println("����������� ��� ���������� ������ B");
    }

   B(String args){
	   super(); // ����� ������������ � ����� ���������� ������ A
        System.out.println("����������� � ����� ���������� ������ B");
    }
}

// ����-����� � �����
public class TestThisSuper {

    public static void main(String args[]) {
       B b = new B();
    }

}