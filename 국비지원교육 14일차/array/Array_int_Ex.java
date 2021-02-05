package p02.array;
//Array: 같은 타입이 연속적, 크기 고정(크기 못바꿈) -> 그래서 나온게 ArrayList


//error 2가지 
//1) compile error   2)runtime error
public class Array_int_Ex {

	public static void main(String[] args) {
		//배열 생성 방법1
		int[] arr1 = {10,20,30};
	
		//배열 생성 방법2
		int[] arr2 = new int[3];
		arr2[0]=new Integer(10); //integer라는 class 타입 --> 잘쓰지 않는 타입
		arr2[1]=20; //int 타입         //new Integer(10) 표현과  10 표현은 똑같은거다
		arr2[2]=30;                  //new Integer(10) -> 10 언박싱이라고 함
		//arr2[3]=20;//에러
		//System.out.println(arr2[3]);//runtime error
		
	    //배열 생성 방법3
	    int[] arr3 = new int[] {10,20,30};

		int temp = arr3[0] + arr3[2];//40
		System.out.println(temp);
		System.out.println(arr3[0]);
		
		//일반 for문
		for(int i=0 ; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//향상된 for문
		for(int arrayTest : arr3){// for( 데이터 타입  변수   : 출력하고자하는 배열)
			//arr3 배열에 있는 0번쨰 값부터 arrayTest에 저장하고 실행문을 돌려라. 라는 뜻임.
			System.out.println(arrayTest);
		}
		
		
	
	}
}
