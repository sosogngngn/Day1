package ArithmeticOperator;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����,");
		System.out.println(result + "������ ���´�.");//0.2999999999999�� ����
       //��Ȯ�� 0.3�� ������ �ʴ´�. �ٻ�ġ�� ������ ��
	   //0.3�� ������ �Ϸ���?
	}

}

/*0.3 �� ������ ����
package ArithmeticOperator;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple*10;
		int number = 7;
		int temp = totalPieces - number
		
		double result = temp/10.0;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����,");
		System.out.println(result + "������ ���´�.");//0.3�� ����
		
		//���긶�� ���̰� �߻�.
	    //���� ������ ������ ����ϴ� �ε��Ҽ��� Ÿ��(float, double)�� 0.1�� ��Ȯ�� ǥ���� 
	    //�� ���� �ٻ�ġ�� ó���ϱ� ������
	    //�ε��Ҽ��� Ÿ���� ������ ��ߵǴ� ��� �ƴϰ� ���ϴ°� ����.
	     
	     */
		