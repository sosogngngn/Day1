package ifSwitch;

public class ifexample {

	public static void main(String[] args) {
		int score = (int)((Math.random())*20+81);//81~100�� ������ ����
		String grade ;
		if(score>=90) {
			if(score>95) {
			
				grade="A+";
			}
			
			else { grade="A";}
		
		}
		else {
				if(score>=85) {
					grade="B+";
				}
				else
					grade="B";
			}
		System.out.println("����= "+score);
		System.out.println("����: "+grade);

	
	}
	
}

//else if �� �ϴ°� �� ���� ��? �׳� ���������� ������ �� ������� ���� ������
