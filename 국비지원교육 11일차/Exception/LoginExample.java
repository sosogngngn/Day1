package Exception;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white","12345");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","12345");
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
		public static void login(String ID, String Password) throws NotExistIDEException,WrongPasswordException {
		if(!ID.equals("blue")) {
				
		throw new NotExistIDEException("���̵� �������� �ʽ��ϴ�.");
		}
		
		if(!Password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
		
	}
}
