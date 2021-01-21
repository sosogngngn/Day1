package ifSwitch;

public class Dice {

	public static void main(String[] args) {
		int a = (int)((Math.random())*10.0) ;
	
		if(a>5)
		{ System.out.println("5보다 큽니다.");
		}
		else
		{System.out.println("5보다 작습니다.");
		}
		
		System.out.println(a); //1~10사이 정수가 나오는지 확인
	}

}



//Math.random() -> 0부터 1미만 까지의 실수를 출력(1은 포함 x)
//정수 출력하려면 (int)((Math.random())*10.0) 이렇게 강제 형변환 해줘야함
//이건 1(포함)~10사이의 실수를 출력해줌