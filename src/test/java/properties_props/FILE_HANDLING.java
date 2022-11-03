package properties_props;

import java.util.Properties;

public class FILE_HANDLING {

	public static void main(String[] args) {
		// Properties file will have KEY and Value.//

		
		Properties prop = new Properties();
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\properties_props\\rediff.properties";
	}

}
