package DenyLogic;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true; 
		System.out.println(play);// true ���
		
		play=!play; // !true = false
		System.out.println(play); //false ���
		
		play=!play;// !false = true
		System.out.println(play);//true ���
	}

}
