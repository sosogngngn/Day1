package chap03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
	 int charcode = 'A';
	 
	 if((charcode >= 64) & (charcode <=90))
		 System.out.println("�빮���Դϴ�.");
	 //���� �����̾ �ڱ��� Ȯ��
	
	
	 if((charcode >= 97) && (charcode <=122))
		 System.out.println("�ҹ����Դϴ�.");
	 //���� �����̸� �׳� �ٷ� ���� ���

	 
	 if((charcode < 48) && !(charcode >57))
		 System.out.println("0~9 ���� �̱���.");
	//���� �����̸� �׳� �ٷ� ���� ���
	
	 if((charcode >= 97) && (charcode <=122))
		 System.out.println("�ҹ����Դϴ�.");
	//���� �����̸� �׳� �ٷ� ���� ���

	 int value = 6;
	 
	 if((value%2==0) | (value%3==0))
		 System.out.println("2�� 3�� ����Դϴ�.");
	//���� ���̾ �ڱ��� Ȯ��
	 if((value%2==0) || (value%3==0))
		 System.out.println("2�� 3�� ����Դϴ�.");
	//���� ���̸� �׳� �ٷ� �� ���
	}
	

}
