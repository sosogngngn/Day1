package DoubleFloat;

public class Example {

	public static void main(String[] args) {
	//�Ǽ��� ����
		double var1 = 3.14;//3.14���
		//float var2 = 3.14;//������ ����(Type mismatch)
		//��? ����? �Ǽ��� �⺻ ����Ʈ���� Double ��.
		//float �� ���ڵڿ� F�� ǥ������� ������ ���� �ʴ´�.
		float var3 = 3.14F;//3.14���
		
		//���е� �׽�Ʈ
		double var4 = 0.1234567890123456789;//0.12345678901234568 ���
		float var5 = 0.1234567890123456789F;//0.12345679 ���
		//double�� �� �������� �˼� �ִ�.
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);

		//e ����ϱ�
		int var6 = 3000000;
		double var7 = 3e6;//3���ϱ� 10�� 6����
		float var8 = 3e6F;//F ���̴°� �� ����ϰ�
		double var9 = 2e-3; //2 ���ϱ� 10�� -3����
		//10�� 3������ e3 ���� ǥ���� �� �ִ�.

		
		System.out.println("var6: " + var6);//�״�� ���
		System.out.println("var7: " + var7);//�Ǽ��ϱ� �Ҽ� ù°¥������ ǥ��
		System.out.println("var8: " + var8);//�Ǽ��ϱ� �Ҽ� ù°¥������ ǥ��
		System.out.println("var9: " + var9);//0.002 ���
		
	}

}
//float�� �����κ��� 24��Ʈ �����κ� 8bit
//double�� �����κ��� 54��Ʈ �����κ��� 16bit
