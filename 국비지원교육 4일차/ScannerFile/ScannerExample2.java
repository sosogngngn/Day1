package ScannerFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		File file = new File("input.txt");
		try {
			Scanner sc = new Scanner(file);	
			while(sc.hasNextInt())//sc가 갖고있는 파일에 다음으로 읽어올 정수가 있는지 물어보는 것임
			{
				System.out.println(sc.nextInt()*100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
		}
		
	}
}
