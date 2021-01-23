package javarush;

public class StackTrace {
	public static void main(String[] args) {
		System.out.println("����� Main ������� �������");
		m1();
		System.out.println("����� Main ����������� ���� ������");
	}

	static void m1() {
		try {
			System.out.println("������ ����� �������� ������!(m1)");
			m2();
		} catch (ArithmeticException err) {
			System.out.println(err.getMessage());
			System.out.println("������ ����� ���������� �����������");
		} finally {
			System.out.println("������ ����� ����������� ���� ������");
		}
	}

	static void m2() {
		System.out.println("������ ����� �������� ������!(m2)");
		int x = 10;
		int y = 0;
		double z = x / y;
		System.out.println(z);
		System.out.println("������ ����� ����������� ���� ������");
	}
}