package testBase;



import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



public class BaseClass {

	public  WebDriver driver;
	public Logger logger;
	public Properties p;
	
	
	@SuppressWarnings("deprecation")
	@BeforeClass(groups= {"Sanity","Regression","Master"})
	@Parameters({"os","browser"})
	public void setup(@Optional String os,String br) throws IOException
	{
		FileReader file=new FileReader("./src//config.properties");
		p=new Properties();
		p.load(file);
		logger=LogManager.getLogger(this.getClass());
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			
				//String huburl ="http://localhost:4444";
				DesiredCapabilities cap=new DesiredCapabilities();
				if(os.equalsIgnoreCase("linux"))
				{
					cap.setPlatform(Platform.WIN11);
				}
				
				else if(os.equalsIgnoreCase("Mac")) {
					cap.setPlatform(Platform.MAC);
				}
				else {
					System.out.println("Invalid os");
				}
			
			
		
		switch(br.toLowerCase())
		{
		case "chrome": cap.setBrowserName("chrome");break;
		case "edge": cap.setBrowserName("MicrosoftEdge");break;
		default :System.out.println("invalid browser");return;
		}
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	//	driver= new RemoteWebDriver(new URL("http://192.168.217.1:4444/wd/hub"),cap);
		}

		
		
		if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			
		switch(br)
		{
		case "chrome": driver=new ChromeDriver();break;
		case "firefox": driver=new FirefoxDriver();break;
		default :System.out.println();return;
		}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://tutorialsninja.com/demo/");
driver.manage().window().maximize();
	}

	public String randomeString()
	{
		String randomAlpa=RandomStringUtils.randomAlphabetic(5);
		return randomAlpa;
	}
	
	public String randomeNumeric()
	{
		String randomnumeric=RandomStringUtils.randomNumeric(3);
		return randomnumeric;
	}
	
	public String randomeAlphNumeric()
	{
		String randomalpha=RandomStringUtils.randomAlphabetic(5);
	String randomnumeric=RandomStringUtils.randomNumeric(3);
	return (randomalpha+randomnumeric);
	}
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
