package Construction;
//�������� �������̵� -> �ϴ����� �پ��� ������� ��ü�� ������ �� �ְ� �ϱ� ����.
public class Car {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car(){ //-> ���� ����ִ� company�� ��� ���� //������ 1
		
	}

	Car(String model){   //������ 2 -> �ܺο��� model ���� �޾ƿ� �� ������ �ʱ�ȭ �Ѵٴ� ����.
		this.model=model;
	}
	
	Car(String model, String color){//������ 3
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){ //������ 4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
				
	}
}
