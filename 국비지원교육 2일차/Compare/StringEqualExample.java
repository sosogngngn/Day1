package Compare;

public class StringEqualExample {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö"; //�Ź�ö�� �ҿ��Ҽ� ��� �Ź�ö�� �ּ�(����)�� ��������
		String strVar2 = "�Ź�ö"; //�ּҰ��� ���� strVar1�̶� 
		String strVar3 = new String("�Ź�ö"); //�ٸ� ���� �ſ�� �ּ� ����.(��ü)


		System.out.println(strVar1 == strVar2);//�׷��� �̰� true(�ּҰ��� ����)
		System.out.println(strVar1 == strVar3);//false why? �ٸ� ������ �Ź�ö �ּҰ��̴ϱ�
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		//��ü�� �ּҰ����� �𸣰ڰ� �� �ּ��� ����(�Ź�ö)�� ������ ���ٰ� �ϰڴ� �Ҷ� ���°�  .equals��.
		System.out.println(strVar1.equals(strVar3));
		//�ּҴ� �ٸ����� ������ �����ϱ� True!
	}

}
