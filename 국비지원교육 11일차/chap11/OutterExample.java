package chap11;

public class OutterExample {

	public static void main(String[] args) {
	
		Outter outter = new Outter() ; // Outter 梓端 持失
		Outter.Nested nested = outter.new Nested(); // Nested 梓端持失
		nested.print();

	}

}
