package Casting;

public class castingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue=(char)intValue; //int�� char�� ���� ����ȯ
		System.out.println(charValue);//'��' �������
		
		long longValue=500;
		intValue=(int)longValue; //long Ÿ���� int�� ��������ȯ
		System.out.println(intValue);//500 ��� int �����������ϱ� ©���� ���� ����
		
		double doubleValue=3.14;
		intValue = (int)doubleValue;//double Ÿ���� int�� ��������ȯ
		System.out.println(intValue);//3 ���

	}

}


//��������ȯ(Casting)