package in.capgemini.amazon.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestBase {
	public static WebDriver driver;
	public static Properties prop;

	public AmazonTestBase() {
		try {
			prop = new Properties();
			String path = "E:\\CapSeleniumAutomationTesting\\AmazonTestingAutomation\\src\\test\\resources\\property\\configurations.properties";
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS );
        driver.get(prop.getProperty("url"));
	}
	

}
