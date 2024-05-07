package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePage {

	public static WebDriver driver;
	private Properties prop;
	private FileInputStream fis;
	
	@BeforeTest
	public void setUp() throws IOException {
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.prop");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));

		if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
