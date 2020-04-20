package configurations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_demo_properties_file;

public class Properties_File {

	static Properties prop= new Properties();
	static String projectpath=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getProperties();
		setProperties();
	}
	public static void getProperties ()
	{
		try {

			projectpath= System.getProperty("user.dir");
			InputStream input =new FileInputStream(projectpath+"/src/test/java/configurations/config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			TestNG_demo_properties_file.browserName=browser;

		} catch (Exception e) {

			e.printStackTrace();

			System.out.println(e.getCause());
			System.out.println(e.getMessage());

		}
	}

	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(projectpath+"/src/test/java/configurations/config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);

		} catch (Exception e) {

			e.printStackTrace();

			System.out.println(e.getCause());
			System.out.println(e.getMessage());

		}
	}
}
