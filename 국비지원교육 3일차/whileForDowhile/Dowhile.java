package whileForDowhile;
import java.util.Scanner;


public class Dowhile {
	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in); //--> ��ĳ�� ��ü ����
		String inputString;
		
		do {
			//System.out.println(">>>");
			//enterġ�� �Է��ϸ� �� ��°��� ���� �ȳ�����?
		
			inputString = scanner.nextLine();	
		    System.out.println(inputString);		
		}
		while(! inputString.equals("q")) ; //-> do while ���� wile ��ȣ ���� �ݵ�� ; ������
		{
			System.out.println();
			
		}
		System.out.println("���α׷�����");	
	}

}
//�Է� �޴� ��� (scanner ����ϱ�)
//1. ������ impotr java.util.Scanner; �������ְ�
//2. Scanner scanner= new Scanner(System.in); -> scanner ��ü ����
//3. intputStrint = scanner.nextLine(); Ű����� �Է��� ���� �ޱ�
//Do ���� �����ϰ� While ������ ��.