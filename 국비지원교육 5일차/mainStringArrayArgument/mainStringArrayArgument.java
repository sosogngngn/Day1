package mainStringArrayArgument;

public class mainStringArrayArgument {

	public static void main(String[] args) {//

		if(args.length!=2) {
			System.out.println("프로그램 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0); // -> 시스템 강제 종료
		}
		
		String strNum1 = args[0]; // -> 마우스 오른쪽 클릭 -> run as -> run configurations -> Program arguments 첫번째 변수를 받겠다.(Consle 창에서 입력받지 않고)
		String strNum2 = args[1]; // -> 마우스 오른쪽 클릭 -> run as -> run configurations -> Program arguments 두번째 변수를 받겠다.(Consle 창에서 입력받지 않고)
		
		int num1 = Integer.parseInt(strNum1); // String -> int로 변환
		int num2 = Integer.parseInt(strNum2); // String -> int로 변환
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}

//main 매소드의 매개변수인 String[] arg 을 통해서 커맨드 라인에서 입력된 데이터의 수(배열의 길이) 와 입력된 데이터(배열의 항목 값)을 알 수 있다.
//즉 cmd 창에서 문자열을 받았을 때 main 함수를 호출하는 용도이다.
