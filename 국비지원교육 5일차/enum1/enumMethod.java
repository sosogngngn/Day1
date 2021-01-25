package enum1;
import java.util.Scanner;
public class enumMethod {

	public static void main(String[] args) {
		//name 매소드
		Week today = Week.SUNDAY; 
		String name = today.name(); //-> 객체가 가지고 있는 문자열을 리턴, 이때 리턴되는 문자열은 여거 타입을 정의할 때 사용한 상수 이름과 동일하다.
		System.out.println(name); //Sunday 출력
		//name() 매소드는 열거 객체 내부의 문자열인 "SUNDAY"를 리턴하고 name 변수에 저장한다.
		
		//original() 메소드
		int ordinal = today.ordinal(); //ordinal() 메소드는 전체 열거 객체 중 몇 번째 열거 객체인지 알려준다. 열거 객체의 순번은 열거타입을 정의할 때 주어진 순번을 말함.
		                               //0부터 시작한다. -> Week enum에  MODAY가 제일 위에있다. -> 이게 0
		System.out.println(ordinal);//6출력 SUNDAY는 6번째에 위치해 있다.
		
		//비교할것.comparTo(비교당할것) 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENDSDAY;
		int result1 = day1.compareTo(day2); // day1 - day2 MONDAY=1   , WENDSDAY=3 ->-2 출력
		int result2 = day2.compareTo(day1); // day2 - day1  -> 어렵게 생각하지말고 앞에서 뒤에꺼 뺀다 생각하자 ->2출력
		System.out.println(result1);
		System.out.println(result2);
		
		
		//valueOf 메소드 ->매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴한다.
		//이 매소드는 외부로부터 문자열을 입력받아 열거 객체로 변환할 때 유용하게 사용할 수 있다.
		Scanner sc = new Scanner(System.in);
		if(args.length==1) {
			String strDay = sc.next();
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATUARDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요.");
			}
			else {
				System.out.println("평일 이군요");
			}
		}	
		//value(); 매소드 ->열거 타입의 모든 열거 객체들을 배열로 만들어 리턴한다. (형식을 외워두자)
		Week[] days=Week.values();
		for(Week day : days) {
			System.out.println(day);
	}
	}	

}
