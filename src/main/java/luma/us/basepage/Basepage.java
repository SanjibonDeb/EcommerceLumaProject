package luma.us.basepage;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {

 public static WebDriver driver;
 public static Properties prop;
 public static Logger log;
 
 
 public Basepage() {
	 log= Logger.getLogger("Test Lead Sanjibon");
	 PropertyConfigurator.configure("Log4j.properties");
	 prop= new Properties();
	 FileInputStream fl;
	try {
		fl = new FileInputStream("./src/main/java/luma/us/configue/Config.properties");
		 prop.load(fl);
	
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	finally {
		System.out.println("Printed Out");
	}
	
	}



	public static void getAutomationStart() {
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			log.info("Start Automation in chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		 
		else if (browserName.equalsIgnoreCase("firefox")) {
			log.info("Start Automation in firefox Browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}	
		else if (browserName.equalsIgnoreCase("edge")) {
			log.info("Start Automation in edge Browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.navigate().to("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		
		
	
	}

}
