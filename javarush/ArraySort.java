package javarush;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		String str1="�����";
        String str2="�APOH";
        String str3="�����";
        String str4="�����";
        String str5="�����";
        String str6="�����";
        String str7="�����";
String[] allStr=new String[]{str1,str2,str3,str4, str5,str6, str7};
        Arrays.sort(allStr);
        for (String s:allStr){
            System.out.println(s);
        }
    }
	}

	


