package Casting;

public class Accuracy {

	public static void main(String[] args) {
	 int num1 = 123456780;
	 int num2 = 123456780;
	 
	 float num3 = num2;
	 num2 = (int) num3;
	 
	 int result = num1 - num2 ;
	 System.out.println(result);

	}

}

//double num3 = num2 �϶��� 0�� ���ʹ´�
//float num3 = num2 �϶��� �� �ս��� �߻��ұ�? ����� -4��.
//int�� float�� ��ȯ�Ҷ� �ս��� �߻��� float ����(8��Ʈ), ����(23bit) �κ��� �Ѿ� ���� ������
//-> �� �����κ��� �Ѿ���� int�� 32bit�̳� float�� �����κ��� 23bit�� �ս��� �߻���.
//0.12345x10E1 -> ���� 0.12345 ���� 1 �� ��.
//double�� ����(11��Ʈ) + �����κ��� (52bit)
//�� float ���� double �� �� ������ ���� ������ �� �ִ�.