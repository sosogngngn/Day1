package chap07;

public class Car_getter_setter_Example {

	public static void main(String[] args) {
		Carg_getter_setter myCar = new Carg_getter_setter();
		myCar.setSpeed(-50); // 0���� ������ 0���� �ӵ� �ʱ�ȭ 0���� ũ��
		                     //�ӵ��� ����
		System.out.println("����ӵ�:"+ myCar.getSpeed()); //getspeed�� field�� �ִ� speed ���� �о��.

		 //0���� ū��
		myCar.setSpeed(60); 
	
		System.out.println("����ӵ�: "+ myCar.getSpeed());
         //-> �̰� �� 60 ��¾ȵǰ� 0 ��µǴ°�? 		
		if(!myCar.isStop()) { //boolean Ÿ��. stop �ʱ�ȭ�� ��������
			                  //�⺻������ false�� ����
			myCar.setStop(true);//�ӵ� 0���� ������ְ� stop�� true�� ����(���� ����x)
		}
	System.out.println("����ӵ�:"+myCar.getSpeed());
	}

}
