package week3.day1;

public class SmartPhone extends AndroidPhone{
		
		public void connectWhatsapp()
		{
			System.out.println("connecting to Whatsapp");
		}
	public static void main(String[] args) {
		
			SmartPhone smartPhn = new SmartPhone();
			smartPhn.sendMsg();
			smartPhn.makeCal();
			smartPhn.saveContact();
			smartPhn.takeVideo();
			smartPhn.connectWhatsapp();
			
	}

}
