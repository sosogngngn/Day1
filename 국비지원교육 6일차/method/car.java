package method;

public class car {
	int gas; //��������
	
	void Setgas(int gas) {
		this.gas = gas;  //�ܺηκ��� gas�� �Է¹޾Ƽ� �ʵ尪�� �ٲ�		
	}
	
	boolean isLeftGs() {
		if(gas==0) {
			System.out.println("������ �����ϴ�.");
			return false;
		}
		else{System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.");
				gas-=1;
			}
			else {
				System.out.println("����ϴ�.(gas�ܷ�: " + gas + ")");
				return;//�޼ҵ� ���� ����
			}
		}
	}

}
