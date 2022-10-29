package telephone;

import handphone.Android;
import handphone.iPhone;

public class TelephoneTest {

	public static void main(String[] args) {
		Telephone [] telpon = new Telephone[5];
		telpon[0] = new TelephoneBooth("08123", "Indonesia");
		telpon[1] = new Handphone("555", "Faiz Alvin");
		telpon[2] = new Android("913", "Kai Daxa", "Samsung", "S22 Ultra");
		telpon[3] = new iPhone("333", "Delta Beta", "Pro 14");
		telpon[4] = new Android("000", "Argo", "Vivo");
		
		line();
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("telpon[%d] Standing by%n", i);
			telpon[i].call();
			System.out.println("Thanks for call");
			telpon[i].end();
			line();
		}
	}
	
	public static void line()
	{
		System.out.println("------------------------------------");
	}

}
