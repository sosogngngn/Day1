package mainStringArrayArgument;

public class mainStringArrayArgument {

	public static void main(String[] args) {//

		if(args.length!=2) {
			System.out.println("���α׷� ����");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0); // -> �ý��� ���� ����
		}
		
		String strNum1 = args[0]; // -> ���콺 ������ Ŭ�� -> run as -> run configurations -> Program arguments ù��° ������ �ްڴ�.(Consle â���� �Է¹��� �ʰ�)
		String strNum2 = args[1]; // -> ���콺 ������ Ŭ�� -> run as -> run configurations -> Program arguments �ι�° ������ �ްڴ�.(Consle â���� �Է¹��� �ʰ�)
		
		int num1 = Integer.parseInt(strNum1); // String -> int�� ��ȯ
		int num2 = Integer.parseInt(strNum2); // String -> int�� ��ȯ
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}

//main �żҵ��� �Ű������� String[] arg �� ���ؼ� Ŀ�ǵ� ���ο��� �Էµ� �������� ��(�迭�� ����) �� �Էµ� ������(�迭�� �׸� ��)�� �� �� �ִ�.
//�� cmd â���� ���ڿ��� �޾��� �� main �Լ��� ȣ���ϴ� �뵵�̴�.
