package ScannerFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		try {	
			File file= new File("out.txt") ; //out.txt�� ����ρٴ�. ���� Ŭ������ txt�� 
			                                 //������ָ�ȴ�.
		    Scanner sc = new Scanner(file); //System.in�� console â�� �Է¹ްڴٶ� ���̰�
		                                    //�� file�� out.txt ������ ���� �Է¹ްڴٴ� ����.
		    while(sc.hasNextInt())
		    {
		    	System.out.println(sc.nextInt()*10000);
		    }
		    sc.close();
		} catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		
}
	}

/* try ���� �����Ҷ� �߻��� �� �ִ� ����(������ ��ã�� ����)
 * �� ������ ���α׷��� ���߰� ���� �ʱ� ���� �̷��� �� ������
 * catch�� �����϶� �ϴ� ������ �ʿ���.
 */

