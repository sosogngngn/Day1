package bit_reverse;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1=10; //int �ڷ��� 10���� 10�� �������� ǥ���ϸ� ->00000000000000000000000000001010 
		int v2=~v1;//~(��Ʈ ��������)                     11111111111111111111111111110101
		int v3=~v1 +1;//                              11111111111111111111111111110110 
		System.out.println(toBinaryString(v1)+ " (������: " + v1 + ")");//10���
		System.out.println(toBinaryString(v2)+ " (������: " + v2 + ")");//-11���
		System.out.println(toBinaryString(v3)+ " (������: " + v3 + ")");//-10���
		System.out.println();
		
		int v4 = -10;//     11111111111111111111111111110110 
		int v5 = ~v4;//     00000000000000000000000000001001
		int v6 = ~v4 + 1;// 00000000000000000000000000001010
		
		System.out.println(toBinaryString(v4)+ " (������: " + v4 + ")");
		System.out.println(toBinaryString(v5)+ " (������: " + v5 + ")");
		System.out.println(toBinaryString(v6)+ " (������: " + v6 + ")");
		
	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str="0" + str;//10������ 2������ ǥ���� �� ���� 0���� ä��ٴ� ��
		}//str.lenth -> Integer.toBinaryString(value)�� ����(integer�� 32��Ʈ �� ���̴� 32) 
		return str;
	}
}
//10������ �������� ǥ���ϸ� 32�ڸ����� ǥ���ȴ�. 
//int�� 4byte(=4*8bit=32bit)�ϱ� �ִ� 32bit ���� ǥ�� �����ϴ�.
//integer.toBinaryString �� �ڹٿ��� �����ϴ� �޼���� integer(10����)�� �޾� binary(2����)�� ǥ��
//int�� class ���� integer(int ����� �����ϸ鼭 �ٸ� ����� ����)
//�Լ��� ���ؼ� ���� �˾ƾ��� (���� ���δ� ������ �� ����)
//Ŭ���� �ȿ� ���ǵ� �Լ��� �ż�������.