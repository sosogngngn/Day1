package enum1;

import java.util.Calendar;
public class Enum1 {

	public static void main(String[] args) {
		 Week today = null ; //���� ��Ű�� �ȿ� Week�� Ŭ������ �־���� ->public enum Week WeekŸ���� today ������ ������(today���� Week�� ������ ���� ����)
		 
		 Calendar cal = Calendar.getInstance(); //Calendar.getIntance()�� ����ð��� �����´�. cal�� ������. //->�߻� Ŭ������ new�� ��ü�� �������� �ʾƵ� �ȴ�.
		 int week = cal.get(Calendar.DAY_OF_WEEK); //��(1) ~ ��(7)������ ���ڸ� ���� week�� ����
		 
		 
		 int month = cal.get(Calendar.MONTH) + 1 ;
		 System.out.println("������ ���?" +month+"��");// -> 1���
		 
		 int hour = cal.get(Calendar.HOUR);
		 System.out.println("���� �����?"+hour+"��");  //���� �ð� (��)
		 
		 int minute = cal.get(Calendar.MINUTE);
		 System.out.println("���� ����̾�?"+minute+"��");//���� �ð�(��)
		 
		 switch(week) {
		 case 1: 
			 today = Week.SUNDAY;
			 break;
		 case 2: 
			 today = Week.MONDAY;
			 break;
		 case 3: 
			 today = Week.TUESDAY;
			 break;
		 case 4: 
			 today = Week.WENDSDAY;
			 break;
		 case 5: 
			 today = Week.THURSDAY;
			 break;
		 case 6: 
			 today = Week.FRIDAY;
			 break;
		 case 7: 
			 today = Week.SATUARDAY;
			 break;
			 
		 }
		 
		 System.out.println("���� ����: "+ today); //(���� ����)���� ���ڰ� ����
		 if(today == Week.SUNDAY) {
			 System.out.println("��ȸ�� ���ϴ�.");
		 }
		 else {
			 System.out.println("������ �ڹٸ� �����մϴ�.");
		 }

	}

}
//import java.util.Calendar;
// Calendar ���� = Calendar.getInstance();
/* int year = ����.get(Calendar.YEAR); �⵵
 * int month = ����.get(Calendar.MONTH) + 1 ; ->��(1~12)
 * int day = ����.get(Calendar.DAY_OF_MONTH); ->��
 * int week = ����.get(Calendar.DAY_OF_WEEK); ->����(1~7)
 * int hour = ����.get(Calendar.HOUR); -> �ð�
 * int minute = ����.get(Calendar.MINUTE); -> ��
 * int second = ����.get(Calendar.SECOND_; -> ��
 */
 
