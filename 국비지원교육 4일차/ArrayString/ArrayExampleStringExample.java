package ArrayString;

public class ArrayExampleStringExample {

	public static void main(String[] args) {
		
		int array[] = new int[5];
		for(int i=0; i<5; i++) {
			array[i]=i; 
			System.out.print(array[i]+" ");			
		} //array[0]~array[5]�� ���ֱ� 1
//---------------------------------------------------------------------
		System.out.println();
//---------------------------------------------------------------------		
		int s;
		int[] Array= {1,2,3,4,5,6,7,8,9};
		for(s=0; s<9; s++ )
		{
		System.out.print(Array[s]+" ");
		}
//---------------------------------------------------------------------		
		System.out.println();
//---------------------------------------------------------------------		
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 �� strVar2�� ������ ����.");
		}
		else {
			System.out.println("strVar1 �� strVar2�� ������ �ٸ���.");
		}
		
	
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1 �� strVar2�� ���ڿ��� ����.");
		}
		else {System.out.println("strVar1 �� strVar2�� ���ڿ��� �ٸ���.");
	}
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3 �� strVar4�� ������ ����.");
		}
		else {
			System.out.println("strVar3 �� strVar4�� ������ �ٸ���.");
		}
		if(strVar3.equals(strVar4))
		{
			System.out.println("strVar3 �� strVar4�� ���ڿ��� ����.");
		}
		
	}
}
