package enum1;
import java.util.Scanner;
public class enumMethod {

	public static void main(String[] args) {
		//name �żҵ�
		Week today = Week.SUNDAY; 
		String name = today.name(); //-> ��ü�� ������ �ִ� ���ڿ��� ����, �̶� ���ϵǴ� ���ڿ��� ���� Ÿ���� ������ �� ����� ��� �̸��� �����ϴ�.
		System.out.println(name); //Sunday ���
		//name() �żҵ�� ���� ��ü ������ ���ڿ��� "SUNDAY"�� �����ϰ� name ������ �����Ѵ�.
		
		//original() �޼ҵ�
		int ordinal = today.ordinal(); //ordinal() �޼ҵ�� ��ü ���� ��ü �� �� ��° ���� ��ü���� �˷��ش�. ���� ��ü�� ������ ����Ÿ���� ������ �� �־��� ������ ����.
		                               //0���� �����Ѵ�. -> Week enum��  MODAY�� ���� �����ִ�. -> �̰� 0
		System.out.println(ordinal);//6��� SUNDAY�� 6��°�� ��ġ�� �ִ�.
		
		//���Ұ�.comparTo(�񱳴��Ұ�) �޼ҵ�
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENDSDAY;
		int result1 = day1.compareTo(day2); // day1 - day2 MONDAY=1   , WENDSDAY=3 ->-2 ���
		int result2 = day2.compareTo(day1); // day2 - day1  -> ��ư� ������������ �տ��� �ڿ��� ���� �������� ->2���
		System.out.println(result1);
		System.out.println(result2);
		
		
		//valueOf �޼ҵ� ->�Ű������� �־����� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü�� �����Ѵ�.
		//�� �żҵ�� �ܺηκ��� ���ڿ��� �Է¹޾� ���� ��ü�� ��ȯ�� �� �����ϰ� ����� �� �ִ�.
		Scanner sc = new Scanner(System.in);
		if(args.length==1) {
			String strDay = sc.next();
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATUARDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ��̱���.");
			}
			else {
				System.out.println("���� �̱���");
			}
		}	
		//value(); �żҵ� ->���� Ÿ���� ��� ���� ��ü���� �迭�� ����� �����Ѵ�. (������ �ܿ�����)
		Week[] days=Week.values();
		for(Week day : days) {
			System.out.println(day);
	}
	}	

}
