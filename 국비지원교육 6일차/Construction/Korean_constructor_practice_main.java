package Construction;

public class Korean_constructor_practice_main {

	public static void main(String[] args) {
		Korean k1 = new Korean("���ڹ�","18-13707");  // -> ������� Korean class �� ������ n,s�� ���Եȴ�.
		System.out.println("k1.name > "+ k1.name);
		System.out.println("k1.id > " + k1.id);
		
		Korean k2 = new Korean("�Ӽ���","60142020");
		System.out.println("k2.name > "+ k2.name);
		System.out.println("k2.id > "+ k2.id);

	}

}
