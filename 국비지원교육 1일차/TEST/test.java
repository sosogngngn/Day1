package TEST;

public class test {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		//10 ��� ������ -> ū��(�ڵ�����ȯ)
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ�=" + intValue);
		//���� ���� �����ڵ� 44032 ��� 
		
		intValue = 500 ;
		long longValue = intValue;
		System.out.println(longValue);
		//500 �״�� ��� ������(int)->ū��(long) �ڵ�����ȯ
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		//200.0 ������(int)->ū��(double) ����->�Ǽ� �Ҽ��� ù°¥������ ���
		

	}

}
