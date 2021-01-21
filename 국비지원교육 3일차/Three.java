
public class Three {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C' );
//(score>90)이 조건이 참이니 ? 참이면 'A' : 아니면  ((score>80)이 조건 참이니? ? 참이면 'B',아니면 'C')
		System.out.println(score + "점은"+ grade + "입니다");
	}
}
//3항 연산자
