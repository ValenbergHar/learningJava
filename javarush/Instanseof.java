//������ �����, ������� ����������, ����� ������ �������� � ����.
//��������� ������ �������� �� ����� ���� �� ��������:
//"���", "����", "���", "���", "������", "��������".

package javarush;
public class Instanseof {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        String result = "";
        boolean isFind = false;

        if (o instanceof Cat) {
            result = "���";
            isFind = true;
        }
        if (o instanceof Tiger) {
            result = "����";
            isFind = true;
        }
        if (o instanceof Lion) {
            result = "���";
            isFind = true;
        }
        if (o instanceof Bull) {
            result = "���";
            isFind = true;
        }
        if (o instanceof Cow) {
            result = "������";
            isFind = true;
        }
        if (o instanceof Animal && !isFind) {
            result = "��������";
        }

        return result;
    }


    public static class Cat extends Animal   //<--������ �����������!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
