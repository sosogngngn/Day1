package ArrayString;

public class ArrayExampleStringExample {

	public static void main(String[] args) {
		
		int array[] = new int[5];
		for(int i=0; i<5; i++) {
			array[i]=i; 
			System.out.print(array[i]+" ");			
		} //array[0]~array[5]에 값넣기 1
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
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 과 strVar2는 참조가 같다.");
		}
		else {
			System.out.println("strVar1 과 strVar2는 참조가 다르다.");
		}
		
	
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1 과 strVar2는 문자열이 같다.");
		}
		else {System.out.println("strVar1 과 strVar2는 문자열이 다르다.");
	}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3 과 strVar4는 참조가 같다.");
		}
		else {
			System.out.println("strVar3 과 strVar4는 참조가 다르다.");
		}
		if(strVar3.equals(strVar4))
		{
			System.out.println("strVar3 과 strVar4는 문자열이 같다.");
		}
		
	}
}
