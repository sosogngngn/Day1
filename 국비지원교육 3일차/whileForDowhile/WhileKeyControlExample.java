package whileForDowhile;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {//Ű���带 ������ �߸� �Էµ� ����
		boolean run= true;                              //����ó���ϴ� �Լ� throws Exeption
		int speed = 0;
		int KeyCode = 0;
		
		while(run) //-> true ���̶� ���ѷ�����
		{
			if(KeyCode!=13 && KeyCode!=10) {//-> �Է��ϰ� emter�� �����ߵǱ� ������ 
				                            //-> enter ���� �������ִ� ����.
				System.out.println("--------------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("--------------------------");
				System.out.println("����: ");
			}
			
			KeyCode = System.in.read();
			
			if(KeyCode == 49) { //1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			}
			else if(KeyCode == 50) {//2�� �о��� ���
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			}
			else if(KeyCode == 51) {//3�� �о��� ���
				run = false; //while ���� �����ϱ� ���� run�� false����	
				System.out.println("���α׷� ����");
			 //run = false ; ��� ���⿡ break; �ᵵ��
		}
	}
	}
}
//Ű������ �� Ű�� ���� �մ� Ű �ڵ�
/* 0 ->48     A -> 65     a-> 97    Backspace = 8 , enter = 13,10 , TAP = 9 
   1 ->49     B -> 66     b-> 98    ���....
   2 ->50     ......      ......
   3 ->51     Z -> 90     z-> 122
    .....
   9->57 
 */