package Casting;

public class castingExample2 {
	public static void main(String[] args) {
	    int i = 128;
	    
	    if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)){
	    	System.out.println("byte 타입으로 변환할 수 없습니다.");
	    	System.out.println("값을 다시 확인해 주세요");
	    	} //i가 byte 최대값 보다 크고 최소값 보다 작으면 if문을 실행
	    else {
	    	byte b = (byte) i;
	    	System.out.println(b);
	    }//i가 byte 범위 안에 있으면 else문 실행

	}

}

//Byte.MIN_VALUE -> byte가 갖고있는 최소값을 저장해 놓은 클래스라서 갖다 쓸수있음
//Byte.MAX_VALUE -> byte가 갖고있는 최대값을 저장해 놓은 클래스라서 갖다 쓸수있음
//if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) class 이용
//byte 자료형의 클래스는 Byte.
//int 자료형의 클래스는 Integer.
//long 자료형의 클래스는 Long.
//Long.MIN_VALUE , Integer.MIN_VALUE 등등 있음.