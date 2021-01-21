package chap03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
	 int charcode = 'A';
	 
	 if((charcode >= 64) & (charcode <=90))
		 System.out.println("대문자입니다.");
	 //앞이 거짓이어도 뒤까지 확인
	
	
	 if((charcode >= 97) && (charcode <=122))
		 System.out.println("소문자입니다.");
	 //앞이 거짓이면 그냥 바로 거짓 출력

	 
	 if((charcode < 48) && !(charcode >57))
		 System.out.println("0~9 숫자 이군요.");
	//앞이 거짓이면 그냥 바로 거짓 출력
	
	 if((charcode >= 97) && (charcode <=122))
		 System.out.println("소문자입니다.");
	//앞이 거짓이면 그냥 바로 거짓 출력

	 int value = 6;
	 
	 if((value%2==0) | (value%3==0))
		 System.out.println("2와 3의 배수입니다.");
	//앞이 참이어도 뒤까지 확인
	 if((value%2==0) || (value%3==0))
		 System.out.println("2와 3의 배수입니다.");
	//앞이 참이면 그냥 바로 참 출력
	}
	

}
