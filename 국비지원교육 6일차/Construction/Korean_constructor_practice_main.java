package Construction;

public class Korean_constructor_practice_main {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바","18-13707");  // -> 순서대로 Korean class 의 생성자 n,s로 대입된다.
		System.out.println("k1.name > "+ k1.name);
		System.out.println("k1.id > " + k1.id);
		
		Korean k2 = new Korean("임수빈","60142020");
		System.out.println("k2.name > "+ k2.name);
		System.out.println("k2.id > "+ k2.id);

	}

}
