package p08.abstractclass;

public class Tetragon extends Figure {

	@Override
	void area(int a, int b) {
		System.out.println("사각형의 넓이: " + (a*b));
	}

}
