package ArithmeticOperator;

public class IntinityAndNaNcheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y=0.0;
		
		double z=x/y;
		//double z=x%y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));//->x%y -> NAN
		
		
		System.out.println(z+2);// 무한대에 무한대 더해봤자 Infinity임
		//->잘못된 코드
		
		
		//옳은코드
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}
		else {
			System.out.println(z+2);
		}
	}

}

//isNAN 입력받은 값이 nan이니 아니니? 체크하는 메서드 
//isInfinite 입력받은 값이 무한대냐 아니냐? 체크하는 매서드
//나머지 연산잔 10/0 ->infinity
//나누기 연산자 10%0 ->NaN
