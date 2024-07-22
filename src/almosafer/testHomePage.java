package almosafer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class testHomePage extends dataCases {
	
	
	
	public void CheckLanguageDefaultTest() {
	       
		      WebElement tagHtml = myDriver.findElement(By.tagName("html"));
		      String ActualLanguage = tagHtml.getAttribute("lang");
		      Assert.assertEquals(ActualLanguage,ExpectedEngleshLanguage);
		      			
	}
	
    public void CheckverificationCurrencyDefaultTest() {
	       
        
		String ActualCrruency = myDriver.findElement(By.cssSelector(".sc-dRFtgE.fPnvOO")).getText();
	      Assert.assertEquals(ActualCrruency, ExpectedCrruency);
	      			
	      			
}

	public void CheckverificationContactNumberTest() {
	       
String ActualContactNumber = myDriver.findElement(By.tagName("strong")).getText();
		
		Assert.assertEquals(ActualContactNumber,ExpectedContactNumber);
	      			
}

	public void checkLogoQetafIsDeispledTest() {
	       
	      WebElement Footer = myDriver.findElement(By.tagName("footer")); 
			Boolean ActualFoundQetafLogo =Footer.findElement(By.cssSelector(".sc-fihHvN.eYrDjb")).findElement(By.tagName("svg")).isDisplayed();
			Assert.assertEquals(ActualFoundQetafLogo,ActualFoundQetafLogo);
	      			
}



}
