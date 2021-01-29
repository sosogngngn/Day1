package inheritage;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	public boolean roll() { //����� �ٸ��� �ϱ� ���ؼ� overriding
		++accumulatedRotation;
		
		if(maxRotation<maxRotation) {
			System.out.println(location + " HankookTire ����: "+ (accumulatedRotation-maxRotation)+"ȸ");
			return true;
		}
		else {
			System.out.println("***"+location+ " HankookTire ��ũ" +"***");
			return false;
		}
		
	}
	
}
