package chap11;

public class OutterExample {

	public static void main(String[] args) {
	
		Outter outter = new Outter() ; // Outter ��ü ����
		Outter.Nested nested = outter.new Nested(); // Nested ��ü����
		nested.print();

	}

}
