package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializedriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}


}
