package javarush;

import java.util.HashMap;
import java.util.Map;

public class MapDelete {
    public static Map<String, String> createMap() {
        Map <String, String> map = new  HashMap <String, String>();
         map.put("�������", "�����");
        map.put("������", "����");
        map.put("��������", "����");
        map.put("������", "�����");
        map.put("������", "�����");
        map.put("������", "�����");
        map.put("�������", "���������");
        map.put("��������", "�����");
        map.put("������", "����");
        map.put("����", "������");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        //���� �� map2
        for (Map.Entry<String, String> pair : map2.entrySet())
        {
            //������� �� map3 ����, ������� ������������� pair
            map3.remove(pair.getKey());
            //��������� �� ������  � map3 �������� ��������������� �������� �� pair
            if (map3.containsValue(pair.getValue()))
            {   //���� ���� ����� �� �������� - �������� �������� ��������� �������� pair �� ���������� map
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
        }

    

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
 

    }
}
