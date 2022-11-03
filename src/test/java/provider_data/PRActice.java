package provider_data;

import org.testng.annotations.Test;

public class PRActice {

	
	@Test (dataProvider = "dua", dataProviderClass = PRActice.class)
	public void LaunchUrl(String Browser, String Url, String Username, String Password) {
		

	}

}
