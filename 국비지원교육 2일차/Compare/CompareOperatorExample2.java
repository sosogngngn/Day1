package Compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); 
		//True -> �̰� �� true?  �ᱹ int v2 = 1 �� 1.0�� ���� �׷��� TRUE �ΰŰ� 
		
		double v4 = 0.1; //-> �̰͵� ��Ȯ�� 0.1�� �ƴ�
		float v5 =  0.1f; //-> �̰� ��Ȯ�� 0.1�� �ƴ� 0.1000000003 �̷��� �ٻ簪��
		System.out.println(v4==v5);//false ->�׷��� false��
		System.out.println((float)v4 == v5); //true -> �Ѵ� float �ϱ� true
		System.out.println((int)(v4*10) == (int)(v5*10));//true
		
//�Ҽ����� ����Ȯ�� ���̴�.
	}

}
