package Operation;

public class operationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1=10;
		byte byteValue2=20;
		//byte byteValue3=byteValue1 + byteValue2; 
		//->������ ���� ������? ���������� ������ ������ int�� �ٲ㼭 ���� �ϱ� �����̴�. 
		//�� byteValue3�� int�ڷ����� �ȴٴ� ����.
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1); //30 ���
        
        byte charValue1='A';
		byte charValue2=1;
		//char charValue3= charValue1 + charValue2; 
		//->������ ���� ������? ���������� ������ ������ int�� �ٲ㼭 ���� �ϱ� �����̴�. 
		//�� charValue3�� int�ڷ����� �ȴٴ� ����.
        int intValue2 = charValue1 + charValue2;
        System.out.println("�����ڵ�="+ intValue2);// �����ڵ� = 66 ���
        System.out.println("��¹���="+ (char)intValue2);// ��¹���=B ���
        
        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println(intValue4);//2 ���
        
        int intValue5 = 10;
        //int intValue6 = 10/4.0; 
        //->�����Ͽ��� �Ǽ��� �������ϱ� intValue6 �� �ڷ����� double�� �Ǿ����.
        double doubleValue = intValue5/4.0;
        System.out.println(doubleValue);//2.5 ���
	}

}

//���� �ڷ����� ���� Ÿ�� ��ȯ.
//�̰� �� �����ϸ� ��ü ���⿡�� Ŭ�������� Ÿ�Ժ�ȯ���� ������
//������ ������ ������!!!!!!!!!!! int�� ��ȯ�ؼ� ����ȴ�!!!!! ������ ������ int�� ����Ʈ����