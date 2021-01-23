package javarush;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareUserEx implements Comparable<CompareUserEx> {// ��������� ����������� ���������� ������� User

	private String name;
	private Integer age;
	private String email;

	public CompareUserEx(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	@Override
//��������� ����� compareTo ���������� Comparable
	public int compareTo(CompareUserEx o) {

//���������� ����� compareTo �� ������ String ��� ��������� ����
		int result = this.name.compareTo(o.name);

//���� ����� ���������� -  ���������� �������,
		// ��������� ����� compareTo �� ������ Integer

		if (result == 0) {
			result = this.age.compareTo(o.age);
		}
		return result;
	}

	@Override
	public String toString() {
		return "{" + "name='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + '}';
	}

	public static void main(String[] args) {
		CompareUserEx user = new CompareUserEx("������", 19, "andryha@mail.ru");
		CompareUserEx user2 = new CompareUserEx("����", 25, "oleg@mail.ru");
		CompareUserEx user3 = new CompareUserEx("������", 24, "opr@google.com");
		CompareUserEx user4 = new CompareUserEx("�����", 16, "igor@mail.ru");
		CompareUserEx user5 = new CompareUserEx("������", 44, "stary@google.com");
		List<CompareUserEx> list = new ArrayList<>();

		list.add(user);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);

		System.out.println("-------�� ����������--------");
		for (CompareUserEx u : list) {
			System.out.println(u);
		}
		System.out.println("-------����� ����������-----");
		Collections.sort(list);
		for (CompareUserEx u : list) {
			System.out.println(u);
		}
	}
}
