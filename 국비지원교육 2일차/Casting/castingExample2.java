package Casting;

public class castingExample2 {
	public static void main(String[] args) {
	    int i = 128;
	    
	    if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)){
	    	System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
	    	System.out.println("���� �ٽ� Ȯ���� �ּ���");
	    	} //i�� byte �ִ밪 ���� ũ�� �ּҰ� ���� ������ if���� ����
	    else {
	    	byte b = (byte) i;
	    	System.out.println(b);
	    }//i�� byte ���� �ȿ� ������ else�� ����

	}

}

//Byte.MIN_VALUE -> byte�� �����ִ� �ּҰ��� ������ ���� Ŭ������ ���� ��������
//Byte.MAX_VALUE -> byte�� �����ִ� �ִ밪�� ������ ���� Ŭ������ ���� ��������
//if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) class �̿�
//byte �ڷ����� Ŭ������ Byte.
//int �ڷ����� Ŭ������ Integer.
//long �ڷ����� Ŭ������ Long.
//Long.MIN_VALUE , Integer.MIN_VALUE ��� ����.