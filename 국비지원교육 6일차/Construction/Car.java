package Construction;
//생성자의 오버라이딩 -> 하는이유 다양한 방법으로 객체를 생성할 수 있게 하기 위함.
public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){ //-> 값이 들어있는 company만 출력 가능 //생성자 1
		
	}

	Car(String model){   //생성자 2 -> 외부에서 model 값을 받아와 그 값으로 초기화 한다는 말임.
		this.model=model;
	}
	
	Car(String model, String color){//생성자 3
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){ //생성자 4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
				
	}
}
