package School_instance_save_version;
import java.util.Scanner;
public class teacher {
	int sum;
	
	Scanner sc = new Scanner(System.in);
	Student student = new Student();
	void Input() {
		System.out.println("학생 이름 입력:");
		student.name = sc.next();
		System.out.println(student.name + "의 국어 점수");
		student.kor = sc.nextInt();
		System.out.println(student.name + "의 영어 점수");
		student.eng = sc.nextInt();
		System.out.println(student.name + "의 수학 점수");
		student.math = sc.nextInt();
		
	}
	void sum() {
		sum = student.kor + student.eng + student.math ;
		System.out.println(student.name + "의 총점: " + sum);
	}

	void avg() {
		double avg = sum/3;
		System.out.println(student.name + "의 평균: "+ avg);
	}
}
