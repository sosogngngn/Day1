package p08.abstractclass;

public class AbstractTest {

	public static void main(String[] args) {
		
		//추상클래스: Figure (이름)
		//추상매소드: void area(int a, int b)
		
		
		//Triangle Class 삼각형의 넓이: 20
		Triangle t1 = new Triangle();
		t1.area(3, 4);
		
		//Tetragon Class 사각형의 넓이: 30
		Tetragon t2 = new Tetragon();
		t2.area(3,4);

	}

}
