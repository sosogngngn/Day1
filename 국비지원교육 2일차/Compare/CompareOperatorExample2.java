package Compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); 
		//True -> 이건 왜 true?  결국 int v2 = 1 은 1.0과 같아 그래서 TRUE 인거고 
		
		double v4 = 0.1; //-> 이것도 정확히 0.1이 아님
		float v5 =  0.1f; //-> 이게 정확히 0.1이 아님 0.1000000003 이렇게 근사값임
		System.out.println(v4==v5);//false ->그래서 false임
		System.out.println((float)v4 == v5); //true -> 둘다 float 니까 true
		System.out.println((int)(v4*10) == (int)(v5*10));//true
		
//소수점은 부정확한 수이다.
	}

}
