package projectbased;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
public	WebDriver driver;
	public WebDriver initializedriver() throws IOException {

		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(
				"//home//hp-021//Desktop//javaselenium//Productively//src//main//java//data.proprties");
		props.load(fis);
		String browserName = props.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/hp-021/Downloads/chromedriver");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} else if (browserName.equals("firefox")) {

		} else if (browserName.equals("IE")) {

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		return driver;
	}

}
