package upgardeFor;

public class upgardeFor {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum=0;
		for(int score : scores) {//scores �迭 �׸��� ó������ �ϳ��ϳ�
			                     //score�� �����Ͽ� ���๮�� �����ϰ� ��.
			sum+=score;//ù ������ 0+=95 -> sum=95�� ��. �̷��� �ϳ��� ����
		}              //�ι�° ���� 95+=71 -> sum= 95+71 �̷��� 
		System.out.println("���� ���� = "+sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("���� ���="+avg);

	}

}


//���� for���� ����ϴ� ����: ���� �ϳ��� ������ �ξ� ī��Ʈ ���� �ʾƵ� �ȴ�.