package upgardeFor;

public class upgardeFor {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum=0;
		for(int score : scores) {//scores 배열 항목을 처음부터 하나하나
			                     //score에 대입하여 실행문을 실행하게 됨.
			sum+=score;//첫 연산이 0+=95 -> sum=95가 됨. 이렇게 하나씩 쭉쭉
		}              //두번째 연산 95+=71 -> sum= 95+71 이런식 
		System.out.println("점수 총합 = "+sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균="+avg);

	}

}


//향상된 for문을 사용하는 이유: 따로 하나의 변수를 두어 카운트 하지 않아도 된다.