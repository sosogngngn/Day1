package ifSwitch;

public class ifexample {

	public static void main(String[] args) {
		int score = (int)((Math.random())*20+81);//81~100점 사이의 성적
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
		System.out.println("점수= "+score);
		System.out.println("학점: "+grade);

	
	}
	
}

//else if 로 하는게 더 쉬울 듯? 그냥 개념적으로 구분할 수 있으라고 나온 예제임
