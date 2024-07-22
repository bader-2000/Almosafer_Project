package almosafer;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class dataCases    {
	 protected static WebDriver myDriver = new ChromeDriver(); ;
	 String  Url = "https://www.almosafer.com/en"; 
	 String  ExpectedEngleshLanguage = "en" ;
	 String  ExpectedArabicLanguage = "ar" ;
	 String  ExpectedCrruency = "SAR";
	 String  ExpectedContactNumber="+966554400000" ;
	 Boolean ExpectedFoundQetafLogo = true;
	 String  ExpectedSelectedHotelTap = "false";
	 Random rand = new Random();
	 
	 @BeforeSuite
	 public void setUp(){
		 if(myDriver == null ){
			 myDriver = new ChromeDriver();
			 
			 myDriver.manage().window().maximize();
			 myDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		 }
	 }
	 @AfterSuite
	 public void tearDown(){
		 if(myDriver != null) {
			 myDriver.quit();
			 myDriver = null;
		 }
	 }
	 
	 
	 
	 public void theDeafultConfiguration() {
		 
		   
		    myDriver.get(Url);
			myDriver.manage().window().maximize();
			myDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			WebElement website = myDriver.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary"));
				website.click();
	 }
}
