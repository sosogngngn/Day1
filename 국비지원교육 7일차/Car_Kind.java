package chap07;

public class Car_Kind {
	String name;
	int speed;

	Car_Kind(String name){
		this.name=name;
	}
	
	void Speed(int speed) { //���� speed�� �޴� �żҵ带 ���� ������� ������
		                    //�����ڴ� �ܺηκ��� �Ű������� �޾ƿ��� Ŭ���� ���ο��� ���� ������ �� ����.
        this.speed=speed;   //-> �� �żҵ带 �����ϸ� field�� speed ���� ����ȴ�.
	}
	
	void run() {
		for(int i=10 ; i<=50; i+=10) {
			Speed(i);
			System.out.println(this.name+"�� �޸��ϴ�.(�ü�:"+this.speed+")km/h");
	
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
