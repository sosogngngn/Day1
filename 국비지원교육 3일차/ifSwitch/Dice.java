package ifSwitch;

public class Dice {

	public static void main(String[] args) {
		int a = (int)((Math.random())*10.0) ;
	
		if(a>5)
		{ System.out.println("5���� Ů�ϴ�.");
		}
		else
		{System.out.println("5���� �۽��ϴ�.");
		}
		
		System.out.println(a); //1~10���� ������ �������� Ȯ��
	}

}



//Math.random() -> 0���� 1�̸� ������ �Ǽ��� ���(1�� ���� x)
//���� ����Ϸ��� (int)((Math.random())*10.0) �̷��� ���� ����ȯ �������
//�̰� 1(����)~10������ �Ǽ��� �������