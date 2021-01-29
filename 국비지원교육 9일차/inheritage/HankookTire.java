package inheritage;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	public boolean roll() { //출력을 다르게 하기 위해서 overriding
		++accumulatedRotation;
		
		if(maxRotation<maxRotation) {
			System.out.println(location + " HankookTire 수명: "+ (accumulatedRotation-maxRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+location+ " HankookTire 펑크" +"***");
			return false;
		}
		
	}
	
}
