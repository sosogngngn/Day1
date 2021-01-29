package inheritage;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		
		if(maxRotation<maxRotation) {
			System.out.println(location + "KumhoTire ����: "+ (accumulatedRotation-maxRotation)+"ȸ");
			return true;
		}
		else {
			System.out.println("***"+location+ "KumhoTire ��ũ" +"***");
			return false;
		}
	}

}