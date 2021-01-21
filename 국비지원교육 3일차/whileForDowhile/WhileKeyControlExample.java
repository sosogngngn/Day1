package whileForDowhile;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {//키보드를 읽을때 잘못 입력된 것을
		boolean run= true;                              //예외처리하는 함수 throws Exeption
		int speed = 0;
		int KeyCode = 0;
		
		while(run) //-> true 값이라 무한루프돔
		{
			if(KeyCode!=13 && KeyCode!=10) {//-> 입력하고 emter를 눌러야되기 때문에 
				                            //-> enter 값을 제거해주는 것임.
				System.out.println("--------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("--------------------------");
				System.out.println("선택: ");
			}
			
			KeyCode = System.in.read();
			
			if(KeyCode == 49) { //1을 읽었을 경우
				speed++;
				System.out.println("현재 속도=" + speed);
			}
			else if(KeyCode == 50) {//2를 읽었을 경우
				speed--;
				System.out.println("현재 속도=" + speed);
			}
			else if(KeyCode == 51) {//3을 읽었을 경우
				run = false; //while 문을 종료하기 위해 run에 false저장	
				System.out.println("프로그램 종료");
			 //run = false ; 대신 여기에 break; 써도됨
		}
	}
	}
}
//키보드의 각 키가 갖고 잇는 키 코드
/* 0 ->48     A -> 65     a-> 97    Backspace = 8 , enter = 13,10 , TAP = 9 
   1 ->49     B -> 66     b-> 98    등등....
   2 ->50     ......      ......
   3 ->51     Z -> 90     z-> 122
    .....
   9->57 
 */