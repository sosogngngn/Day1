package ArithmeticOperator;

public class IntinityAndNaNcheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y=0.0;
		
		double z=x/y;
		//double z=x%y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));//->x%y -> NAN
		
		
		System.out.println(z+2);// ���Ѵ뿡 ���Ѵ� ���غ��� Infinity��
		//->�߸��� �ڵ�
		
		
		//�����ڵ�
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("�� ���� �Ұ�");
		}
		else {
			System.out.println(z+2);
		}
	}

}

//isNAN �Է¹��� ���� nan�̴� �ƴϴ�? üũ�ϴ� �޼��� 
//isInfinite �Է¹��� ���� ���Ѵ�� �ƴϳ�? üũ�ϴ� �ż���
//������ ������ 10/0 ->infinity
//������ ������ 10%0 ->NaN
