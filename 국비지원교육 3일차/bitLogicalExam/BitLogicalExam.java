package bitLogicalExam;

public class BitLogicalExam {

	public static void main(String[] args) {
		System.out.println("45 & 25=" +(45 & 25));//��Ʈ�� ����
		//00101101
		//00011001
		//����(AND)
		//----------
		//00001001 -> 9
		
		System.out.println("45 | 25=" +(45 | 25));//��Ʈ�� ����
		//00101101
		//00011001
		//����(OR)
		//----------
		//00111101 ->61
		
		System.out.println("45 ^ 25=" +(45 ^ 25));
		//00101101
		//00011001
		//��Ÿ�� ����(XOR) -> 1, 0 �ٸ� ���� 1 �������� ���� 0
		//----------
		//00110100 ->52
		
		System.out.println("~45=" +(~45));
		//00101101
		//�� ����(NOT)-> 1�� ->0 ���� 0->1���� ��Ʈ ����
		//----------
		//11010010 -> -46
		
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(45));
		System.out.println("||");
		System.out.println(toBinaryString(45));
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str="0"+str;
		}
		return str; //�� String toBinaryString �Լ��� ����, ���� ���� �� �����
		//�������� ��ȯ�ؼ� ������ ������ �ش� ���ڸ� �������� ���� ���� ����.
		//�������� �������� ��ȯ���ִ� �Լ��̴�.
	}

}
