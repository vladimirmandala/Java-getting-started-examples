import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertiesClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties TestExecution = new Properties();
		FileInputStream fs=null;;
		try {
			 fs = new FileInputStream("D:\\SDG\\Employee-Personal\\AutomationKit\\src\\test\\resources\\TestExecution.properties");
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			TestExecution.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(TestExecution.getProperty("Browser"));
		String BrowserList [] = TestExecution.getProperty("Browser").split(":");
		System.out.println(BrowserList.length);
		for (int i=0;i<BrowserList.length;i++){
			System.out.println(BrowserList[i]);
		}
	}

}
