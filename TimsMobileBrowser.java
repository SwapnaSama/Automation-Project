package timsMobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class TimsMobileBrowser {
	
	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	
	@SuppressWarnings("rawtypes")
	@BeforeTest
	public void login() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","Pixel_2_Api_29");
		dc.setCapability("udid", "emulator-5554");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("browserName", "Chrome");
		dc.setCapability("chromedriverExecutable", "C:\\Users\\sameera\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
				
	
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		 System.out.println("Application Started");
		 
		 driver.get("https://www.timhortons.ca");
		
	//	 WebElement Apply= driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB'])"));
	//	 Apply.click();
	
	//	 WebElement SigninButton = driver.findElement(By.xpath("(//a[@href='/signin'])"));
	//	 SigninButton.click();
		/* WebElement loginId =  driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])"));
		 loginId.sendKeys("timhortonstesting@gmail.com");
		 WebElement Signin =  driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB'])"));
		 Signin.click();
		*/
		 Thread.sleep(10000);
	}

	
  @Test
  public void testcase1() {
	  
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  	WebElement Order = driver.findElement(By.xpath("(//a[@href='/menu'])"));
	  	Order.click();
	  	WebElement pickup = driver.findElement(By.xpath("(//button[@class='styled-wrapper-button__StyledButton-sc-1sfisn8-0 kFjTER pickupButton'])"));
	  	pickup.click();
	  	WebElement Address = driver.findElement(By.xpath("(//input[@id='storelocator-input'])"));
	  	Address.sendKeys("3480 Rue Simpson");
	  	WebElement AddressSugg = driver.findElement(By.xpath("(//button[@class='autocomplete-address-input__PredictionBtn-sc-152j7f4-4 kNcdVI'])[1]"));
	  	AddressSugg.click();									
	  	
	  	
	  	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	  	
	  	WebElement OrderHere = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 kvCGeG styled__OrderHereOrSelectStoreButton-sc-1mbmdoa-9 styledth__OrderHereOrSelectStoreButton-sc-181hdr-5 kKzGDO'])[1]"));
	  	OrderHere.click();
	  	WebElement TakeOut = driver.findElement(By.xpath("(//button[@class='pickup-mode-contentth__Option-x7gsor-0 fJkrar'])"));
	  	TakeOut.click();
	  	WebElement Coffee = driver.findElement(By.xpath("(//*[@class='tileth__Tile-qvp911-0 ghXGBR'])[1]"));
	  	Coffee.click();
	  	WebElement AddToCart = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB menu-action-buttonsth__MenuActionButton-sc-1j66do7-0 gLBIPY'])"));
	  	AddToCart.click();
	  	WebElement viewCart = driver.findElement(By.xpath("(//*[@class='checkout-button-linkth__IconBagSmall-sc-1ehpcza-1 ihYJLB'])"));
	  	viewCart.click();
	  	
	  	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  	
	  	WebElement closePage = driver.findElement(By.xpath("(//*[@class='close-button__StyledIcon-isthh2-1 ijjaPP'])"));
	  	closePage.click();
	  	WebElement home = driver.findElement(By.xpath("(//a[@href='/'])[2]"));
	  	home.click();
	  	System.out.println("Test Case1 Passed");
	  	
  }
  
  @Test
  public void testcase2() {
	  
		WebElement Order = driver.findElement(By.xpath("(//a[@href='/menu'])"));
	  	Order.click();
	  	WebElement delivery = driver.findElement(By.xpath("(//button[@class='styled-wrapper-button__StyledButton-sc-1sfisn8-0 kFjTER deliveryButton'])"));
	  	delivery.click();
	  	WebElement deliveryAddress = driver.findElement(By.xpath("(//input[@class='base__StyledInput-sc-1glkhtz-7 gEoeUQ'])[2]"));
	  	deliveryAddress.sendKeys("3480 Rue Simpson");
		WebElement AddressSugg = driver.findElement(By.xpath("(//button[@class='autocomplete-address-input__PredictionBtn-sc-152j7f4-4 kNcdVI'])[1]"));
	  	AddressSugg.click();	
	  	WebElement Unit = driver.findElement(By.xpath("(//input[@id='floating-label-input-247'])"));
	  	Unit.sendKeys("711");
	  	WebElement phoneNum = driver.findElement(By.xpath("(//input[@id='floating-label-input-249'])"));
	  	phoneNum.sendKeys("4389298796");
	  	WebElement deliverHere = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB address-modal__StyledButton-sc-11nk7ey-3 dTksNK'])"));
	  	deliverHere.click();
	  	
	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	
	//  	WebElement ChangeStoreOkay = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB dialog__StyledActionButton-sc-1p0q5w7-0 jNMRLA'])[2]"));
	//  	ChangeStoreOkay.click();
	  	
		WebElement Coffee = driver.findElement(By.xpath("(//*[@class='tileth__Tile-qvp911-0 ghXGBR'])[1]"));
	  	Coffee.click();
	  	WebElement AddToCart = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB menu-action-buttonsth__MenuActionButton-sc-1j66do7-0 gLBIPY'])"));
	  	AddToCart.click();
	  	WebElement viewCart = driver.findElement(By.xpath("(//*[@class='checkout-button-linkth__IconBagSmall-sc-1ehpcza-1 ihYJLB'])"));
	  	viewCart.click();
	  	
	  	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  	
	  	WebElement closePage = driver.findElement(By.xpath("(//*[@class='close-button__StyledIcon-isthh2-1 ijjaPP'])"));
	  	closePage.click();
	  	WebElement home = driver.findElement(By.xpath("(//a[@href='/'])[2]"));
	  	home.click();
	  	System.out.println("TestCase2 Passed");
	  
  }
  
  @Test
  public void testcase3() {
	 
	  WebElement more = driver.findElement(By.xpath("(//a[@href='/about'])"));
	  more.click();
	  WebElement TimCard = driver.findElement(By.xpath("(//a[@href='tim-card'])"));
	  TimCard.click();
	  WebElement BuyNow = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB callToActionWidget__CallToActionButton-olt38z-5 lgslIu'])[2]"));
	  BuyNow.click();
	  WebElement DigitalTimCard = driver.findElement(By.xpath("(//a[@href='/ca/en/timcard/egift-tim-card.php'])[1]"));
	  DigitalTimCard.click();
	  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  driver.switchTo().frame("ext_content");
	  
	  WebElement RecepientName = driver.findElement(By.xpath("(//input[@id='email_recipient_name'])"));
	  RecepientName.sendKeys("TimHortons");
	  WebElement RecepientEmail	= driver.findElement(By.xpath("(//input[@id='email_recipient_email'])"));
	  RecepientEmail.sendKeys("timhortonstesting@gmail.com");
	  WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\\\"delivery-info\\\"]/div/a[2]/span"));
	  AddToCart.click();
	  
	  driver.switchTo().defaultContent();
	  
	  WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"control\"]/a[2]/span"));
	  Checkout.click();
	  WebElement CreditCard = driver.findElement(By.xpath("//*[@id=\"control\"]/a[2]/span"));
	  CreditCard.sendKeys("1234876534569292");
	  WebElement NameOnCard = driver.findElement(By.xpath("(//input[@id='cc_name'])"));
	  NameOnCard.sendKeys("TimHortons");
	  
	  driver.switchTo().frame("ext_content");
	  
	  WebElement CVD = driver.findElement(By.xpath("(//input[@id='cc_cvd'])"));
	  CVD.sendKeys("123");
	  WebElement Address = driver.findElement(By.xpath("(//input[@id='cc_address'])"));
	  Address.sendKeys("711-3480 Rue Simpson");
	  WebElement City = driver.findElement(By.xpath("(//input[@id='cc_city'])"));
	  City.sendKeys("Montreal");
	  Select province = new Select(driver.findElement(By.xpath("(//*[@id='cc_state'])")));
	  province.selectByVisibleText("Quebec");
	  WebElement zipcode = driver.findElement(By.xpath("(//input[@id='cc_zip'])"));
	  zipcode.sendKeys("H3G 2N7");
	  WebElement BillingPhone =  driver.findElement(By.xpath("(//input[@id='cc_phone'])"));
	  BillingPhone.sendKeys("4389298796");
	  WebElement Email = driver.findElement(By.xpath("(//input[@id='cc_email'])"));
	  Email.sendKeys("timhortonstesting@gmail.com");
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://www.timhortons.ca");
	  System.out.println("TestCase3 Passed");
	
  }
  
  @Test
  public void testcase4() {
	  
		WebElement Order = driver.findElement(By.xpath("(//a[@href='/menu'])"));
	  	Order.click();
	  	WebElement pickup = driver.findElement(By.xpath("(//button[@class='styled-wrapper-button__StyledButton-sc-1sfisn8-0 kFjTER pickupButton'])"));
	  	pickup.click();
	  	WebElement Address = driver.findElement(By.xpath("(//input[@id='storelocator-input'])"));
	  	Address.sendKeys("3480 Rue Simpson");
	  	WebElement AddressSugg = driver.findElement(By.xpath("(//button[@class='autocomplete-address-input__PredictionBtn-sc-152j7f4-4 kNcdVI'])[1]"));
	  	AddressSugg.click();									
	  	
	  	
	  	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	  	
	  	WebElement OrderHere = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 kvCGeG styled__OrderHereOrSelectStoreButton-sc-1mbmdoa-9 styledth__OrderHereOrSelectStoreButton-sc-181hdr-5 kKzGDO'])[1]"));
	  	OrderHere.click();
	  	WebElement TakeOut = driver.findElement(By.xpath("(//button[@class='pickup-mode-contentth__Option-x7gsor-0 fJkrar'])"));
	  	TakeOut.click();
	  	WebElement Coffee = driver.findElement(By.xpath("(//*[@class='tileth__Tile-qvp911-0 ghXGBR'])[1]"));
	  	Coffee.click();
	  	WebElement AddToCart = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB menu-action-buttonsth__MenuActionButton-sc-1j66do7-0 gLBIPY'])"));
	  	AddToCart.click();
	  	WebElement viewCart = driver.findElement(By.xpath("(//*[@class='checkout-button-linkth__IconBagSmall-sc-1ehpcza-1 ihYJLB'])"));
	  	viewCart.click();
	  	WebElement StartIn20min = driver.findElement(By.xpath("(//label[@class='styledth__Label-fxo5d0-3 jOZbBD'])[4]"));
	  	StartIn20min.click();
	  	WebElement closePage = driver.findElement(By.xpath("(//*[@class='close-button__StyledIcon-isthh2-1 ijjaPP'])"));
	  	closePage.click();
	  	WebElement home = driver.findElement(By.xpath("(//a[@href='/'])[2]"));
	  	home.click();
	  	System.out.println("Test Case4 Passed");
	  
  }
  
  	@Test
  	public void testcase5() {
  		WebElement Order = driver.findElement(By.xpath("(//a[@href='/menu'])"));
	  	Order.click();
	  	WebElement delivery = driver.findElement(By.xpath("(//button[@class='styled-wrapper-button__StyledButton-sc-1sfisn8-0 kFjTER deliveryButton'])"));
	  	delivery.click();
	  	WebElement deliveryAddress = driver.findElement(By.xpath("(//input[@class='base__StyledInput-sc-1glkhtz-7 gEoeUQ'])[2]"));
	  	deliveryAddress.sendKeys("711-3480 Rue Simpson");
	  	WebElement phoneNum = driver.findElement(By.xpath("(//input[@class='base__StyledInput-sc-1glkhtz-7 gEoeUQ'])[4]"));
	  	phoneNum.sendKeys("4389298796");
	  	WebElement deliverHere = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB address-modal__StyledButton-sc-11nk7ey-3 dTksNK'])"));
	  	deliverHere.click();
	  	
	  	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  	
	  	WebElement Coffee = driver.findElement(By.xpath("(//*[@class='tileth__Tile-qvp911-0 ghXGBR'])[1]"));
	  	Coffee.click();
	  	WebElement AddToCart = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB menu-action-buttonsth__MenuActionButton-sc-1j66do7-0 gLBIPY'])"));
	  	AddToCart.click();
		System.out.println("Test case5 Passed");	  
		driver.get("https://www.timhortons.ca");
 
  }
  	
    @Test
    public void testcase6() {
    	
    	WebElement Order = driver.findElement(By.xpath("(//a[@href='/menu'])"));
	  	Order.click();
	  	WebElement pickup = driver.findElement(By.xpath("(//button[@class='styled-wrapper-button__StyledButton-sc-1sfisn8-0 kFjTER pickupButton'])"));
	  	pickup.click();
	  	WebElement Address = driver.findElement(By.xpath("(//input[@id='storelocator-input'])"));
	  	Address.sendKeys("3480 Rue Simpson");
	  	WebElement AddressSugg = driver.findElement(By.xpath("(//button[@class='autocomplete-address-input__PredictionBtn-sc-152j7f4-4 kNcdVI'])[1]"));
	  	AddressSugg.click();									
	  	
	  	
	  	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	  	
	  	WebElement OrderHere = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 kvCGeG styled__OrderHereOrSelectStoreButton-sc-1mbmdoa-9 styledth__OrderHereOrSelectStoreButton-sc-181hdr-5 kKzGDO'])[1]"));
	  	OrderHere.click();
	  	WebElement TakeOut = driver.findElement(By.xpath("(//button[@class='pickup-mode-contentth__Option-x7gsor-0 fJkrar'])"));
	  	TakeOut.click();
	  	WebElement Coffee = driver.findElement(By.xpath("(//*[@class='tileth__Tile-qvp911-0 ghXGBR'])[1]"));
	  	Coffee.click();
	  	WebElement AddToCart = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB menu-action-buttonsth__MenuActionButton-sc-1j66do7-0 gLBIPY'])"));
	  	AddToCart.click();
	  	WebElement Cart = driver.findElement(By.xpath("(//button[@class='cart-menu-buttonth__CartMenuButton-sc-1t0s979-0 iafevH ignore-react-onclickoutside'])"));
	  	Cart.click();
		WebElement CheckOut = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB'])"));
		CheckOut.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	  	WebElement closePage = driver.findElement(By.xpath("(//*[@class='close-button__StyledIcon-isthh2-1 ijjaPP'])"));
	  	closePage.click();
	  	WebElement home = driver.findElement(By.xpath("(//a[@href='/'])[2]"));
	  	home.click();
	  	System.out.println("Test Case6 Passed");
	
    } 	
  	
  	@Test
  	public void testcase7() {
  		
  		 System.out.println("Test (7) is currently unexecutable as Dine-In option is unavailable");
  		
    	} 
  	
	@Test
  	public void testcase8() {
		
		WebElement BrowseOpportunities = driver.findElement(By.xpath("(//a[@href='/join-our-team'])"));
		BrowseOpportunities.click();
		WebElement ApplyNow = driver.findElement(By.xpath("(//a[@href='/search'])[3]"));
		ApplyNow.click();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement Apply =  driver.findElement(By.xpath("(//button[@class='button--apply button is-primary is-rounded'])[1]"));
		Apply.click();
		Select	JobPosition = new Select(driver.findElement(By.xpath("(//*[@id='jobPosition'])")));
		JobPosition.selectByVisibleText("Management");
		WebElement JobType = driver.findElement(By.xpath("//*[@id=\"block-thicareers-content\"]/locations-map-app/div/div[2]/form/article/dialog/section/div/div[3]/div/div[2]/div/div/ul/li[2]/label"));
		JobType.click();
		WebElement Availability = driver.findElement(By.xpath("//*[@id=\"block-thicareers-content\"]/locations-map-app/div/div[2]/form/article/dialog/section/div/div[3]/div/div[3]/div/div/ul/li[2]/label"));
		Availability.click();
		WebElement days = driver.findElement(By.xpath("//*[@id=\"block-thicareers-content\"]/locations-map-app/div/div[2]/form/article/dialog/section/div/div[3]/div/div[4]/div/div/ul/li[1]/label"));
		days.click();
		WebElement HoursPerWeek = driver.findElement(By.xpath("(//input[@id='hoursPerWeek'])"));
		HoursPerWeek.sendKeys("10");
		WebElement PayExpectation = driver.findElement(By.xpath("(//input[@id='payExpectations'])"));
		PayExpectation.sendKeys("16");
		WebElement FirstName =  driver.findElement(By.xpath("(//input[@id='firstName'])"));
		FirstName.sendKeys("Tims");
		WebElement LastName = driver.findElement(By.xpath("(//input[@id='lastName'])"));
		LastName.sendKeys("Hortons");
		WebElement StreetAddress = driver.findElement(By.xpath("(//input[@id='address'])"));
		StreetAddress.sendKeys("711-3480 Rue Simspson");
		WebElement city = driver.findElement(By.xpath("(//input[@id='city'])"));
		city.sendKeys("Montreal");
		Select	Province = new Select(driver.findElement(By.xpath("(//*[@id='state'])")));
		Province.selectByVisibleText("Quebec");
		WebElement ZipCode = driver.findElement(By.xpath("(//input[@id='zipcode'])"));
		ZipCode.sendKeys("H3G2N7");
		WebElement phoneNum = driver.findElement(By.xpath("(//input[@id='phoneNumber'])"));
		phoneNum.sendKeys("4389298796");
		WebElement Email = driver.findElement(By.xpath("(//input[@id='email'])"));
		Email.sendKeys("timortonstesting@gmail.com");
		Select	HowDidYouHear = new Select(driver.findElement(By.xpath("(//*[@id='referrerType'])")));
		HowDidYouHear.selectByVisibleText("Online at TimHortons.com");
		Select	EducationLevel = new Select(driver.findElement(By.xpath("(//*[@id='educationLevel'])")));
		EducationLevel.selectByVisibleText("College/University");
		WebElement Language = driver.findElement(By.xpath("//*[@id=\"block-thicareers-content\"]/locations-map-app/div/div[2]/form/article/dialog/section/div/div[3]/div/div[19]/div/div/ul/li[1]/label"));
		Language.click();
		WebElement ApplyToSubmitApplication = driver.findElement(By.xpath("(//button[@class='button is-primary is-rounded'])"));
		ApplyToSubmitApplication.click();
		System.out.println("Test Case8 Passed");
		  
		driver.get("https://www.timhortons.ca");
		
	}
  	
	 @Test
	  public void test9() throws InterruptedException {
		 
		 WebElement more = driver.findElement(By.xpath("(//*[@class='styled__IconWrap-sc-5wuqqf-0 fDVKWv'])[5]"));
		 more.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(3000);
		 WebElement JoinOurTeam = driver.findElement(By.xpath("(//a[@href='join-our-team'])"));
		 JoinOurTeam.click();
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(3000);
		 WebElement FacebookIcon = driver.findElement(By.xpath("(//a[@href='http://facebook.com/TimHortons/'])"));
		 FacebookIcon.click();
		 Thread.sleep(5000);
		 System.out.println("Testcase9 passed");
		 driver.get("https://www.timhortons.ca");
		 
	 }
  
	 @Test
	  public void test10() throws InterruptedException {
		 
		 WebElement more = driver.findElement(By.xpath("(//*[@class='styled__IconWrap-sc-5wuqqf-0 fDVKWv'])[5]"));
		 more.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(3000);
		 WebElement JoinOurTeam = driver.findElement(By.xpath("(//a[@href='join-our-team'])"));
		 JoinOurTeam.click();
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(3000);
		 WebElement InstaIcon = driver.findElement(By.xpath("(//a[@href='https://www.instagram.com/TimHortons/'])"));
		 InstaIcon.click();
		 Thread.sleep(5000);
		 System.out.println("Testcase10 passed");
		
		 driver.get("https://www.timhortons.ca");
	 }
	 
	 @Test
	  public void test11() throws InterruptedException {
		 
		 WebElement more = driver.findElement(By.xpath("(//*[@class='styled__IconWrap-sc-5wuqqf-0 fDVKWv'])[5]"));
		 more.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(3000);
		 WebElement ContactUs = driver.findElement(By.xpath("(//a[@href='contact-us'])"));
		 ContactUs.click();
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 WebElement ViewFAQs = driver.findElement(By.className("android.widget.Button"));
		 jse.executeScript("arguments[0].scrollIntoView();", ViewFAQs);
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB callToActionWidget__CallToActionButton-olt38z-5 lgslIu'])[1]")).click();
		 System.out.println("TestCase11 Passed");
		 
		 WebElement home = driver.findElement(By.xpath("(//a[@href='/'])[2]"));
		 home.click();
		 
	 }
	 
	 @Test
	  public void test12() throws InterruptedException {
		 
		 WebElement more = driver.findElement(By.xpath("(//*[@class='styled__IconWrap-sc-5wuqqf-0 fDVKWv'])[5]"));
		 more.click();
		 WebElement Nutrition = driver.findElement(By.xpath("(//a[@href='https://company.timhortons.com/ca/en/menu/nutrition-and-wellness.php'])"));
		 Nutrition.click();
		 WebElement Search = driver.findElement(By.xpath("(//input[@class='nutri_searchbox placeholder'])"));
		 Search.sendKeys("Four Cheese Bagel");
		 WebElement SearchButton = driver.findElement(By.xpath("(//input[@class='submit tagged'])"));
		 SearchButton.click();
		 Thread.sleep(9000);
		 
		 System.out.println("Test Case12 Passed");
		  
		  driver.get("https://www.timhortons.ca");

	 }
	 
	 @Test
	  public void test13() throws InterruptedException {
		 
		 WebElement more = driver.findElement(By.xpath("(//*[@class='styled__IconWrap-sc-5wuqqf-0 fDVKWv'])[5]"));
		 more.click();
		 WebElement Nutrition = driver.findElement(By.xpath("(//a[@href='https://company.timhortons.com/ca/en/menu/nutrition-and-wellness.php'])"));
		 Nutrition.click();
		 Thread.sleep(10000);
		 WebElement Menu = driver.findElement(By.xpath("(//img[@class='menu-item tagged'])[4]"));
		 Menu.click();
		 WebElement Breakfast = driver.findElement(By.xpath("(//a[@href='/ca/en/menu/breakfast.php'])[1]"));
		 Breakfast.click();
		 WebElement ItemSandwich = driver.findElement(By.xpath("(//div[@class='product-title'])[1]"));
		 ItemSandwich.click();
		 WebElement NutritionInfo = driver.findElement(By.xpath("//*[@id=\"accordion-2597\"]/a/div/div"));
		 NutritionInfo.click();
		 Select	variety = new Select(driver.findElement(By.xpath("//*[@id=\"nutsnap-variety-select\"]")));
		 variety.selectByVisibleText("Beyond Sausage™ Egg & Cheese");
		 WebElement FullNutritionInfo = driver.findElement(By.xpath("(//a[@id='seeButton'])"));
		 FullNutritionInfo.click();
		 
		 Thread.sleep(5000);
		 
		 System.out.println("Test case13 Passed");
		  
		 driver.get("https://www.timhortons.ca");
		 
	 }
	 
	 @Test
	  public void test14() throws InterruptedException {
		 
		 WebElement more = driver.findElement(By.xpath("(//*[@class='styled__IconWrap-sc-5wuqqf-0 fDVKWv'])[5]"));
		 more.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(3000);
		 WebElement ContactUs = driver.findElement(By.xpath("(//a[@href='contact-us'])"));
		 ContactUs.click();
		 WebElement CompleteTheSurvey = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB callToActionWidget__CallToActionButton-olt38z-5 lgslIu'])[3]"));
		 CompleteTheSurvey.click();
		 WebElement SurveyCode = driver.findElement(By.xpath("//*[@id=\"CN1\"]"));
		 SurveyCode.sendKeys("123412341234123412345");
		 WebElement Start = driver.findElement(By.xpath("(//input[@id='NextButton'])"));
		 Start.click();
		 
		 Thread.sleep(4000);
		  
		 System.out.println("Test case14 Passed");
		  
		 driver.get("https://www.timhortons.ca");
		  
	 }
	 
	 @Test
	  public void test15() throws InterruptedException{
		 
		 WebElement Order = driver.findElement(By.xpath("(//a[@href='/menu'])"));
		  	Order.click();
		  	WebElement pickup = driver.findElement(By.xpath("(//button[@class='styled-wrapper-button__StyledButton-sc-1sfisn8-0 kFjTER pickupButton'])"));
		  	pickup.click();
		  	WebElement Address = driver.findElement(By.xpath("(//input[@id='storelocator-input'])"));
		  	Address.sendKeys("3480 Rue Simpson");
		  	WebElement AddressSugg = driver.findElement(By.xpath("(//button[@class='autocomplete-address-input__PredictionBtn-sc-152j7f4-4 kNcdVI'])[1]"));
		  	AddressSugg.click();									
		  	
		  	
		  	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		  	
		  	WebElement OrderHere = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 kvCGeG styled__OrderHereOrSelectStoreButton-sc-1mbmdoa-9 styledth__OrderHereOrSelectStoreButton-sc-181hdr-5 kKzGDO'])[1]"));
		  	OrderHere.click();
		  	WebElement TakeOut = driver.findElement(By.xpath("(//button[@class='pickup-mode-contentth__Option-x7gsor-0 fJkrar'])"));
		  	TakeOut.click();
		  	WebElement Coffee = driver.findElement(By.xpath("(//*[@class='tileth__Tile-qvp911-0 ghXGBR'])[1]"));
		  	Coffee.click();
		  	WebElement AddToCart = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB menu-action-buttonsth__MenuActionButton-sc-1j66do7-0 gLBIPY'])"));
		  	AddToCart.click();
		  	WebElement viewCart = driver.findElement(By.xpath("(//*[@class='checkout-button-linkth__IconBagSmall-sc-1ehpcza-1 ihYJLB'])"));
		  	viewCart.click();
		  	WebElement CheckOut = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB'])"));
			CheckOut.click();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		  	WebElement closePage = driver.findElement(By.xpath("(//*[@class='close-button__StyledIcon-isthh2-1 ijjaPP'])"));
		  	closePage.click();
		  	WebElement home = driver.findElement(By.xpath("(//a[@href='/'])[2]"));
		  	home.click();
		  	
		  	System.out.println("Test Case15 Passed");
		 
	 }
	 
	 
}
