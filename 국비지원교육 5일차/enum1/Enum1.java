package enum1;

import java.util.Calendar;
public class Enum1 {

	public static void main(String[] args) {
		 Week today = null ; //같은 패키이 안에 Week란 클래스가 있어야함 ->public enum Week Week타입의 today 변수를 선언함(today에는 Week의 변수만 저장 가능)
		 
		 Calendar cal = Calendar.getInstance(); //Calendar.getIntance()가 현재시각을 가져온다. cal은 변수임. //->추상 클래스라 new로 객체를 선언하지 않아도 된다.
		 int week = cal.get(Calendar.DAY_OF_WEEK); //일(1) ~ 토(7)까지의 숫자를 리턴 week도 변수
		 
		 
		 int month = cal.get(Calendar.MONTH) + 1 ;
		 System.out.println("오늘은 몇월?" +month+"월");// -> 1출력
		 
		 int hour = cal.get(Calendar.HOUR);
		 System.out.println("지금 몇시지?"+hour+"시");  //현재 시간 (시)
		 
		 int minute = cal.get(Calendar.MINUTE);
		 System.out.println("지금 몇분이야?"+minute+"분");//현재 시간(분)
		 
		 switch(week) {
		 case 1: 
			 today = Week.SUNDAY;
			 break;
		 case 2: 
			 today = Week.MONDAY;
			 break;
		 case 3: 
			 today = Week.TUESDAY;
			 break;
		 case 4: 
			 today = Week.WENDSDAY;
			 break;
		 case 5: 
			 today = Week.THURSDAY;
			 break;
		 case 6: 
			 today = Week.FRIDAY;
			 break;
		 case 7: 
			 today = Week.SATUARDAY;
			 break;
			 
		 }
		 
		 System.out.println("오늘 요일: "+ today); //(오늘 요일)현재 날자가 나옴
		 if(today == Week.SUNDAY) {
			 System.out.println("교회에 갑니다.");
		 }
		 else {
			 System.out.println("열심히 자바를 공부합니다.");
		 }

	}

}
//import java.util.Calendar;
// Calendar 변수 = Calendar.getInstance();
/* int year = 변수.get(Calendar.YEAR); 년도
 * int month = 변수.get(Calendar.MONTH) + 1 ; ->월(1~12)
 * int day = 변수.get(Calendar.DAY_OF_MONTH); ->일
 * int week = 변수.get(Calendar.DAY_OF_WEEK); ->요일(1~7)
 * int hour = 변수.get(Calendar.HOUR); -> 시간
 * int minute = 변수.get(Calendar.MINUTE); -> 분
 * int second = 변수.get(Calendar.SECOND_; -> 초
 */
 
