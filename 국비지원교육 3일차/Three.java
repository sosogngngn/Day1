
public class Three {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C' );
//(score>90)�� ������ ���̴� ? ���̸� 'A' : �ƴϸ�  ((score>80)�� ���� ���̴�? ? ���̸� 'B',�ƴϸ� 'C')
		System.out.println(score + "����"+ grade + "�Դϴ�");
	}
}
//3�� ������
