package inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("ÀÚ¹ÙÆù","°ËÁ¤",10);
		
		System.out.println("¸ðµ¨:"+ dmbCellPhone.model);
		System.out.println("»ö»ó:"+ dmbCellPhone.color);
	
		
		System.out.println("Ã¤³Î: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("¹äÀº ¸Ô¾ú³Ä?");
		dmbCellPhone.receiveVoice("¸Ô¾ú´Ù");

	}

}
