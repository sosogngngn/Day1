package inheritance;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r=10;
		Caculator caculator = new Caculator();
		
		System.out.println(caculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		
		System.out.println(computer.areaCircle(r));
		
		

	}

}
