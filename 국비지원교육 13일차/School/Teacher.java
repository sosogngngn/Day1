package School;
import java.util.Scanner;
public class Teacher {
	
	Student student = new Student();
	Scanner sc = new Scanner(System.in);
	
	//학생 정보 입력
	public void inPut() {
		System.out.println("학생 이름 입력:");	
		student.name = sc.next();
		System.out.println(student.name +"의 국어 점수" );
		student.kor = sc.nextInt();
		System.out.println(student.name +"의 영어 점수" );
		student.eng = sc.nextInt();
		System.out.println(student.name +"의 수학 점수" );
		student.math = sc.nextInt();
		System.out.println("=========입력완료=========");
		}
		
	
	public void sum() {
	  int sum = student.kor + student.eng + student.math;
		System.out.println( student.name+"의총점: "+ sum);
	}
	
	public void avg() {
		int avg = (student.kor + student.eng + student.math)/3;
		System.out.println( student.name+"의 평균: "+ avg);
	}
}
