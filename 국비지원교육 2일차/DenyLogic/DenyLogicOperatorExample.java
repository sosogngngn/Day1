package DenyLogic;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true; 
		System.out.println(play);// true 출력
		
		play=!play; // !true = false
		System.out.println(play); //false 출력
		
		play=!play;// !false = true
		System.out.println(play);//true 출력
	}

}
