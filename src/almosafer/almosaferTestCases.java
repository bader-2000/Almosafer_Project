package almosafer;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class almosaferTestCases extends dataCases  {
	testHomePage Home = new testHomePage();
	testHotelPage Hotel = new testHotelPage();
	
	
	
	
	
	@BeforeTest
	public void setUp() {
		
		theDeafultConfiguration();
	}
	
	
	@Test (description=" MainPage ",priority = 1)
	public void verificationLanguageDefault ()
	{
		Home.CheckLanguageDefaultTest();
	}
	
	
	
	@Test(description="MainPage",priority = 2)
	public void verificationCurrencyDefault ()
	{
		Home.CheckverificationCurrencyDefaultTest();
	}
	
	@Test (description="MainPage",priority = 3 )
	public void verificationContactNumber ()
	{
		Home.CheckverificationContactNumberTest();
		
	}
	
	@Test (description="MainPage",priority = 4)
	public void checkLogoQetafIsDeispled ()
	{
		Home.checkLogoQetafIsDeispledTest();
		
	}
	
	@Test (description="HotelPage",priority = 5)
	public void checkFromNotChoesesHotelTap ()
	{
		Hotel.checkFromNotChoesesHotelTapTest();
	}
	
	@Test (description="HotelPage",priority = 6)
	public void checkFlightDeparturAndReturn ()
	{
		Hotel.checkFlightDeparturAndReturnTest();
		
	}
		
	@Test (description="HotelPage",priority = 7)
	public void checkChangeTheLanguageTheWebSiteRandomly ()
	{
		Hotel.checkChangeTheLanguageTheWebSiteRandomlyTest();
				
				
	}
	
	@Test (description="HotelPage",priority = 8)
	public void checkChangeTheSwitchHotelTapRandomly ()
	{ 
		Hotel.checkChangeTheSwitchHotelTapRandomlyTest();
				
				
	}
	
	@Test (description="HotelPage",priority = 9) 
	public void checkChangeRandomlyForPerson ()
	{ 
		
		Hotel.checkChangeRandomlyForPersonTest();
	}
	

	@Test (description="HotelPage",priority = 10) 
	public void checkWaitToFullyParAPI ()
	{
		
		Hotel.checkWaitToFullyParAPITest();
				
	}
	
	@Test (description="HotelPage",priority = 11) 
	public void checkSortLowstPrices () throws InterruptedException
	{
		Hotel.checkSortLowstPricesTest();
				
	}
	
	
	
	
	
}
