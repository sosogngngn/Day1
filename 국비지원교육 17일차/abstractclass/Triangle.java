package p08.abstractclass;

public class Triangle extends Figure {

	@Override
	void area(int a, int b) {
		
		System.out.println("삼각형의 넓이: "+ a*b/2);

	}

}
