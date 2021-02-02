package Exception;

public class Account {
	private long balance; //�ܺο��� balance�� �������� ���ϰ� private ���� ����
	
	public long getBalance() {
		return balance; //Account class ���ο��� ����� balanc ���� �ܺη� ��� �ϱ� ����.
	}
	
	//����
	public void deposit(int money) {
		balance+=money;
	}
	
	//��ݽ� ���� �߻����� -> ex)10���� �������ϴ´� ���¿� 5���� �ۿ� ������
	public void withdraw(int money) throws BalanceInSufficientException {
		//���ܸ� BalanceInSufficientException���� �ΰ��ϰڴ�. (BalanceInSufficientException Ŭ�������� �� ���ܸ� ó���������. ���ѱ� ����.)
		if(balance<money) {
	    throw new BalanceInSufficientException("�ܰ����"+(money-balance)+"�� ����");
	}
	else {
		balance-=money;
	}

	}
}
