package byteExample;

public class byteExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i = 0 ; i <5;i++) {
			var1++;
			var2++;
			System.out.println("var1: "+ var1 + "\t"+"var2:" + var2);
		}
	}

}
//byte �� 8bit �ֻ��� ��Ʈ�� ��ȣ�� ��Ÿ����(MSB�����)
//-128~127���� ǥ�������� ������ �ֻ��� ��Ʈ�� ��ȣ�ξ��� ������ ������ 7��Ʈ�� ������ ũ�⸦ ��Ÿ����.
//�״ϱ� -2��7�� ~ 2��7��-1
//var1 �� 127���� -128�� �ٷ� �Ѿ��. ������? �ٷ������� ����.