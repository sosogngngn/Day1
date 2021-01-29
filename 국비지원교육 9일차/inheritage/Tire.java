package inheritage;

public class Tire {
	
	public int maxRotation;     //�ִ� ȸ����
	public int accumulatedRotation; //���� ȸ����
	public String location; //Ÿ�̾� ��ġ
	
	public Tire( String location, int maxRotation) {
		this.maxRotation=maxRotation;
		this.location=location;
	}
	
	public boolean roll(){
		++accumulatedRotation;
		
		if(maxRotation<maxRotation) {
			System.out.println(location + "Tire ����: "+ (accumulatedRotation-maxRotation)+"ȸ");
			return true;
		}
		else {
			System.out.println("***"+location+ "Tire ��ũ" +"***");
			return false;
		}
		
	}
}
