package Sign;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x=-100;
		int result1= +x; //(-(+100))=100)
		int result2= -x; //(-(-100))=100)
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		
		short s=100;
		//short result3 = -s;  
		//->�����Ͽ��� short �ڷ����� s������ -���� �� 
		//->integer�� �ٲ� �ڷ����� int�� �Ǽ� ������ ������ ������.
		int result3=-s; //(-(-100))=100)
		System.out.println("result3="+ result3);

	}

}

//���׿��굵 �����̴�! ���������� ����! -> int�� �ڷ��� ��ȯ�ȴ�!