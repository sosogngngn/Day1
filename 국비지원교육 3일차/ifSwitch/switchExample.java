package ifSwitch;

public class switchExample {

	public static void main(String[] args) {
		int Num1 = (int)((Math.random())*6+1); //=> 1~6���� �̱�
		
		switch(Num1)
		{
		case 1:
			System.out.println("�ֻ��� 1�� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println("�ֻ��� 2�� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("�ֻ��� 3�� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("�ֻ��� 4�� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("�ֻ��� 5�� ���Խ��ϴ�.");
			break;
		default:
			System.out.println("�ֻ��� 6�� ���Խ��ϴ�.");
			break;
		}

	}

}

//break ���� ������ ���� �� ���� ��.
//char, String ���� ����.