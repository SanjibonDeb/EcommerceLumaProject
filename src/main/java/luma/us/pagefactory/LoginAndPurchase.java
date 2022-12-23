package luma.us.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.us.basepage.Basepage;
import luma.us.generics.CommonUtilitys;
import luma.us.generics.WaitHelper;

public class LoginAndPurchase extends Basepage {

	public LoginAndPurchase() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
	@CacheLookup
	private WebElement clickSignInBTN;

	public WebElement getClickSignInBTN() {
		return clickSignInBTN;

	}

	@FindBy(xpath = "//input[@title='Email']")
	@CacheLookup
	private WebElement enterUserName;

	public WebElement getEnterUserName() {
		return enterUserName;

	}

	@FindBy(xpath = "//input[@title='Password']")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;

	}

	@FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]")
	@CacheLookup
	private WebElement clickLogin;

	public WebElement getClickLogin() {
		return clickLogin;

	}

	@FindBy(xpath = "//*[text()='Welcome, Soumit Deb!']")
	@CacheLookup
	private WebElement landingPage;

	public WebElement getLandingPage() {
		return landingPage;

	}

	@FindBy(xpath = "//span[text()='Men']")
	@CacheLookup
	private WebElement menModule;

	public WebElement getMenModule() {
		return menModule;

	}

	@FindBy(xpath = "(//span[text()='Tops'])[2]")
	@CacheLookup
	private WebElement selectTops;

	public WebElement getSelectTops() {
		return selectTops;

	}

	@FindBy(xpath = "(//span[text()='Jackets'])[2]")
	@CacheLookup
	private WebElement selectJackets;

	public WebElement getSelectJackets() {
		return selectJackets;

	}

	@FindBy(xpath = "(//*[@class='product-item-link'])[3]")
	@CacheLookup
	private WebElement selectJupiterJacket;

	public WebElement getSelectJupiterJacket() {
		return selectJupiterJacket;

	}

	@FindBy(xpath = "(//span[@class='base'])")
	@CacheLookup
	private WebElement verifyJupiterJacket;

	public WebElement getVerifyJupiterJacket() {
		return verifyJupiterJacket;

	}

	@FindBy(id = "option-label-size-143-item-168")
	@CacheLookup
	private WebElement selectJacketSize;

	public WebElement getSelectJacketSize() {
		return selectJacketSize;

	}

	@FindBy(xpath = "(//div[@class='swatch-option color'])[2]")
	@CacheLookup
	private WebElement selectJacketColor;

	public WebElement getSelectJacketColor() {
		return selectJacketColor;

	}

	@FindBy(id = "qty")
	@CacheLookup
	private WebElement selectJacketQty;

	public WebElement getSelectJacketQty() {
		return selectJacketQty;

	}

	@FindBy(xpath = "//button[@title='Add to Cart']")
	@CacheLookup
	private WebElement selectAddtoCart;

	public WebElement getSelectAddtoCart() {
		return selectAddtoCart;

	}

	@FindBy(xpath = "//a[text()='shopping cart']")
	@CacheLookup
	private WebElement selectShoppingCart;

	public WebElement getSelectShoppingCart() {
		return selectShoppingCart;

	}

	@FindBy(xpath = "//span[text()='Proceed to Checkout']")
	@CacheLookup
	private WebElement selectProccedToChkout;

	public WebElement getSelectProccedToChkout() {
		return selectProccedToChkout;

	}

	@FindBy(xpath = "//*[text()='New Address']")
	@CacheLookup
	private WebElement clickOnNewAddress;

	public WebElement getClickOnNewAddress() {
		return clickOnNewAddress;

	}

	@FindBy(xpath = "(//*[@type='text'])[2]")
	@CacheLookup
	private WebElement inputFirstName;

	public WebElement getInputFirstName() {
		return inputFirstName;

	}

	@FindBy(xpath = "(//*[@type='text'])[3]")
	@CacheLookup
	private WebElement inputLastName;

	public WebElement getInputLastName() {
		return inputLastName;

	}

	@FindBy(xpath = "(//*[@type='text'])[4]")
	@CacheLookup
	private WebElement clickOnCompanyName;

	public WebElement getClickOnCompanyName() {
		return clickOnCompanyName;

	}

	@FindBy(xpath = "(//input[@type='text'])[5]")
	@CacheLookup
	private WebElement inputStreetName;

	public WebElement getInputStreetName() {
		return inputStreetName;

	}

	@FindBy(xpath = "(//input[@type='text'])[8]")
	@CacheLookup
	private WebElement inputCityName;

	public WebElement getInputCityName() {
		return inputCityName;

	}
	
	
	

	@FindBy(xpath = "//*[@name='region_id']")
	@CacheLookup
	private WebElement inputStateName;

	public WebElement getInputStateName() {
		return inputStateName;

	}
	
	@FindBy(xpath = "//*[@name='postcode']")
	@CacheLookup
	private WebElement inputZipCode;

	public WebElement getInputZipCode() {
		return inputZipCode;

	}
	
	@FindBy(xpath = "//*[@name='country_id']")
	@CacheLookup
	private WebElement inputCountryName;

	public WebElement getInputCountryName() {
		return inputCountryName;

	}
	
	@FindBy(xpath = "//*[@name='telephone']")
	@CacheLookup
	private WebElement inputPhoneNumber;

	public WebElement getInputPhoneNumber() {
		return inputPhoneNumber;

	}
	
	@FindBy(xpath = "//span[text()='Ship here']")
	@CacheLookup
	private WebElement clickShipHere;

	public WebElement getClickShipHere() {
		return clickShipHere;

	}
	
	@FindBy(xpath = "//*[@name='ko_unique_3']")
	@CacheLookup
	private WebElement clickOnRadioBTN;

	public WebElement getClickOnRadioBTN() {
		return clickOnRadioBTN;

	}
	
	
	@FindBy(xpath = "//button[@class='button action continue primary']")
	@CacheLookup
	private WebElement clickNext;

	public WebElement getClickNext() {
		return clickNext;
	}
	
	@FindBy(xpath = "//button[@class='action primary checkout']")
	@CacheLookup
	private WebElement clickPlaceOrder;

	public WebElement getClickPlaceOrder() {
		return clickPlaceOrder;
	}
	

	
	
	
	
	@FindBy(xpath="//span[text()='Thank you for your purchase!']")
	@ CacheLookup
	private WebElement verifyText;
	public WebElement getVerifyText() {
		return verifyText ;	
		
	}


	public void ShippingDetails() {

		log.info("User able to enter First name");
		CommonUtilitys.Highlighter(getInputFirstName());
		WaitHelper.seleniumWait(getInputFirstName(), 30);
		getInputFirstName().clear();
		getInputFirstName().sendKeys("Sanjibon");

		log.info("User able to enter Last name");
		CommonUtilitys.Highlighter(getInputLastName());
		WaitHelper.seleniumWait(getInputLastName(), 30);
		getInputLastName().clear();
		getInputLastName().sendKeys("Deb");

		log.info("User able to give Company name");
		CommonUtilitys.Highlighter(getClickOnCompanyName());
		WaitHelper.seleniumWait(getClickOnCompanyName(), 30);
		getClickOnCompanyName().sendKeys("SmartTech");

		log.info("User able to enter Street name");
		CommonUtilitys.Highlighter(getInputStreetName());
		WaitHelper.seleniumWait(getInputStreetName(), 30);
		getInputStreetName().sendKeys("Rugby Road");
		
		log.info("User able to enter City name");
		CommonUtilitys.Highlighter(getInputCityName());
		WaitHelper.seleniumWait(getInputCityName(), 30);
		getInputCityName().sendKeys("Brooklyn");
		
		
		log.info("User able to enter State name");
		CommonUtilitys.Highlighter(getInputStateName());
		WaitHelper.seleniumWait(getInputStateName(), 30);
		CommonUtilitys.getSelectValue(getInputStateName(), "New York");
		
		
		log.info("User able to enter Zip Code");
		CommonUtilitys.Highlighter(getInputZipCode());
		WaitHelper.seleniumWait(getInputZipCode(), 30);
		getInputZipCode().sendKeys("11321");
		
		log.info("User able to enter Country name");
		CommonUtilitys.Highlighter(getInputCountryName());
		WaitHelper.seleniumWait(getInputCountryName(), 30);
		CommonUtilitys.getSelectValue(getInputCountryName(), "United States");

		log.info("User able to enter Phone Number");
		CommonUtilitys.Highlighter(getInputPhoneNumber());
		WaitHelper.seleniumWait(getInputPhoneNumber(), 30);
		getInputPhoneNumber().sendKeys("123456789");
		
		
		log.info("User able to click on ship");
		CommonUtilitys.Highlighter(getClickShipHere());
		WaitHelper.seleniumWait(getClickShipHere(), 30);
		getClickShipHere().click();
		
		
		log.info("User able to click on Radio BTN");
		CommonUtilitys.Highlighter(getClickOnRadioBTN());
		WaitHelper.seleniumWait(getClickOnRadioBTN(), 30);
		//CommonUtilitys.pageDown();
		CommonUtilitys.getJSClick(getClickOnRadioBTN());
	
		
		log.info("User able to click on Next");
		CommonUtilitys.Highlighter(getClickNext());
		WaitHelper.seleniumWait(getClickNext(), 30);
		//CommonUtilitys.pageDown();
		CommonUtilitys.getJSClick(getClickNext());
		
	
		
	}
		

	
	
	

	public void getLogin() {
		log.info("User able to click SignIn button");
		WaitHelper.seleniumWait(getClickSignInBTN(), 30);
		CommonUtilitys.Highlighter(getClickSignInBTN());
		CommonUtilitys.getActionClick(getClickSignInBTN());

		log.info("User able to enter userName");
		WaitHelper.seleniumWait(getEnterUserName(), 30);
		CommonUtilitys.Highlighter(getEnterUserName());
		getEnterUserName().sendKeys(prop.getProperty("userName"));

		log.info("User able to enter password");
		WaitHelper.seleniumWait(getEnterPassword(), 30);
		CommonUtilitys.Highlighter(getEnterPassword());
		getEnterPassword().sendKeys(prop.getProperty("passWord"));

		log.info("User able to click login button");
		WaitHelper.seleniumWait(getClickLogin(), 30);
		CommonUtilitys.Highlighter(getClickLogin());
		CommonUtilitys.getActionClick(getClickLogin());

	}
}
