package ScannerFile;

import java.util.Scanner;
public class ScannerExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str1 = sc.next(); //next�� nextLine ���̾˱�
	
		System.out.print("������ �Է��ϼ���: ");
		int i = sc.nextInt();
		
		System.out.print("�Ǽ��� �Է��ϼ���: ");
		double a = sc.nextDouble();
		
		sc.close();
		
		System.out.println("�Էµ� ���ڿ� : " + str1);
		System.out.println("�Էµ� ����: "+ i);
		System.out.println("�Էµ� �Ǽ�: "+ a);
		

	}

}
//���ڿ�, ����, �Ǽ� Scanner�� �Է¹ް� ����ϴ� ���
/* improt java.util.Scanner;
 * 
 * Scanner sc = new Scanner(System.in);
 * String str = sc.nextLine();-> ���ڿ� ����ڿ��� �Է¹޴� ��
 * int num = sc.nextInt(); -> ���� ����ڿ��� �Է¹޴� ��
 * double num = sc.nextDouble(); -> �Ǽ� ����ڿ��� �Է¹޴� ��* 
 */
