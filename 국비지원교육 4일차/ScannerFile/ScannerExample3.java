package ScannerFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		try {	
			File file= new File("out.txt") ; //out.txt를 사용하곘다. 같은 클래스에 txt를 
			                                 //만들어주면된다.
		    Scanner sc = new Scanner(file); //System.in은 console 창에 입력받겠다란 뜻이고
		                                    //이 file은 out.txt 파일을 통해 입력받겠다는 말임.
		    while(sc.hasNextInt())
		    {
		    	System.out.println(sc.nextInt()*10000);
		    }
		    sc.close();
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
}
	}

/* try 문을 실행할때 발생할 수 있는 오류(파일을 못찾는 오류)
 * 가 있을때 프로그램을 멈추게 하지 않기 위해 이런일 이 있을때
 * catch를 실행하라 하는 문법이 필요함.
 */

