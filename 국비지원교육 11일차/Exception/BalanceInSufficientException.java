package Exception;
//����� ���� ����ó�� -> ���� �ܾ� ����
public class BalanceInSufficientException extends Exception {
	//����ó���� �ֻ��� �θ� ����Ѵ�
	public BalanceInSufficientException() {}
	//������ ����
	public BalanceInSufficientException(String message) {
	//�����޼����� �о� ���ڴ�.
   // throw new BalanceInSufficientException("�ܰ����"+(money-balance)+"�� ����"); �̰� ������
		super(message);
	//message ���ڴ� �θ�(Exeption)���� ���� ��ӵ� ���̴�.
	}

}
