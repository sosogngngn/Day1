package ifSwitch;

public class switchExample {

	public static void main(String[] args) {
		int Num1 = (int)((Math.random())*6+1); //=> 1~6정수 뽑기
		
		switch(Num1)
		{
		case 1:
			System.out.println("주사위 1이 나왔습니다.");
			break;
		case 2:
			System.out.println("주사위 2이 나왔습니다.");
			break;
		case 3:
			System.out.println("주사위 3이 나왔습니다.");
			break;
		case 4:
			System.out.println("주사위 4이 나왔습니다.");
			break;
		case 5:
			System.out.println("주사위 5이 나왔습니다.");
			break;
		default:
			System.out.println("주사위 6이 나왔습니다.");
			break;
		}

	}

}

//break 문이 없으면 전부 다 실행 됨.
//char, String 형도 가능.