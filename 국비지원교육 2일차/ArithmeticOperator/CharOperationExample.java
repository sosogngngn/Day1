package ArithmeticOperator;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1= 'A' +1; 
		//�������� ���� Ÿ������ �ٲ��� �ȴ�. char�� �������� ������ ���� int������ ����ȯ�� �Ͼ��
		// 'A' -> 65(int��) �� ����ȯ�� �Ͼ�� ���⿡ +1 
		//�� �ż� 66�� �Ȼ��¿��� �̰��� char�� ������ ������ 66�� �ش��ϴ� 'B'�� c1�� ����ȴ�.
        char c2= 'A';
        //char c3 = c2 +1; //������ ���� why?
        //char c3 = c2(�����Ҷ� int�� �ٲ�) + 1(int ���ͷ�); -> int�� c3�� �����ؾ� 
        //������ �ȶߴ´� char �̴� ������ ���°���.
        //������ �ȳ��� �Ϸ��� char -> int �ٲٰų� (char)(c2+1)�� ĳ�������ָ� ��.
        //��. ������ ���ͷ��� ������ �Ұ����ϴ�. ���ͷ��� ���ͷ����� ������ �������� �����ؾ���.
        System.out.println("c1:"+ c1);
        System.out.println("c2:"+ c2);
        //System.out.println("c3:"+c3); ->������ ����
	}

}
