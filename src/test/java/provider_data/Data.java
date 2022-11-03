package provider_data;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider 

public static Object[][] shazia(){
			Object[][] data = new Object[3][4];
	
	   
	   data[0][0] = "Chrome";
	   data[0][1] = "https://mail.rediff.com/cgi-bin/login.cgi";
	   data[0][2] = "skmd9197@rediffmail.com";
	   data[0][3] = "Ibrahim@97";
	   
	   data[0][0] = "Firefox";
	   data[1][1] = "https://mail.rediff.com/cgi-bin/login.cgi";
	   data[1][2] = "skmd9197@rediffmail.com";
	   data[1][3] = "Ibrahim@97";
	
	   data[0][0] = "Firefox";
	   data[2][1] = "https://mail.rediff.com/cgi-bin/login.cgi";
	   data[2][2] = "skmd9197@rediffmail.com";
	   data[2][3] = "Ibrahim@97";
	 
	   return data;
	   
	}
}
