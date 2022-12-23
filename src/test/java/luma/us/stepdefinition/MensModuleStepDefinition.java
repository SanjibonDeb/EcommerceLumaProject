package luma.us.stepdefinition;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import luma.us.basepage.Basepage;
import luma.us.generics.CommonUtilitys;
import luma.us.generics.WaitHelper;
import luma.us.pagefactory.LoginAndPurchase;

public class MensModuleStepDefinition extends Basepage {

	LoginAndPurchase pf;

	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {
		pf = PageFactory.initElements(driver, LoginAndPurchase.class);
		pf.getLogin();
		String expected = prop.getProperty("LandingPageTitle");
		CommonUtilitys.Highlighter(pf.getLandingPage());
		WaitHelper.seleniumWait(pf.getLandingPage(), 20);
		String actual = pf.getLandingPage().getText();
		CommonUtilitys.getAssert(actual, expected);

	}

	@When("User should be able to select Jupiter-All-Weather Trainer jacket from men module")
	public void user_should_be_able_to_select_jupiter_all_weather_trainer_jacket_from_men_module() {

		log.info("User able to select men module");
		CommonUtilitys.Highlighter(pf.getMenModule());
		WaitHelper.seleniumWait(pf.getMenModule(), 20);
		CommonUtilitys.mouseHover(pf.getMenModule());

		log.info("User able to select tops");
		CommonUtilitys.Highlighter(pf.getSelectTops());
		WaitHelper.seleniumWait(pf.getSelectTops(), 20);
		CommonUtilitys.mouseHover(pf.getSelectTops());

		log.info("User able to select Jackets");
		CommonUtilitys.Highlighter(pf.getSelectJackets());
		WaitHelper.seleniumWait(pf.getSelectJackets(), 20);
		CommonUtilitys.getActionClick(pf.getSelectJackets());

		log.info("User able to select Jupiter Jackets");
		CommonUtilitys.Highlighter(pf.getSelectJupiterJacket());
		WaitHelper.seleniumWait(pf.getSelectJupiterJacket(), 20);
		CommonUtilitys.getActionClick(pf.getSelectJupiterJacket());

	}

	@When("Verify the jacket name on the Jupiter-All-Weather Trainer list")
	public void verify_the_jacket_name_on_the_jupiter_all_weather_trainer_list() {

		log.info("User able to Validate the jacket");
		CommonUtilitys.Highlighter(pf.getVerifyJupiterJacket());
		String expected = prop.getProperty("JacketName");
		WaitHelper.seleniumWait(pf.getVerifyJupiterJacket(), 20);
		String actual = pf.getVerifyJupiterJacket().getText();
		CommonUtilitys.getAssert(actual, expected);

	}

	@When("User should be able to select the M and Green and {int} then click on the add to cart")
	public void user_should_be_able_to_select_the_m_and_green_and_then_click_on_the_add_to_cart(Integer int1) {

		log.info("User able to select Jackets Size");
		CommonUtilitys.Highlighter(pf.getSelectJacketSize());
		WaitHelper.seleniumWait(pf.getSelectJacketSize(), 30);
		CommonUtilitys.getJSClick(pf.getSelectJacketSize());

		log.info("User able to select Jackets Color");
		CommonUtilitys.Highlighter(pf.getSelectJacketColor());
		WaitHelper.seleniumWait(pf.getSelectJacketColor(), 30);
		CommonUtilitys.getJSClick(pf.getSelectJacketColor());

		log.info("User able to select Jackets Qty");
		CommonUtilitys.Highlighter(pf.getSelectJacketQty());
		WaitHelper.seleniumWait(pf.getSelectJacketQty(), 30);
		CommonUtilitys.getJSClick(pf.getSelectJacketQty());
		pf.getSelectJacketQty().clear();
		pf.getSelectJacketQty().sendKeys("2");

		log.info("User able to add to cart");
		CommonUtilitys.Highlighter(pf.getSelectAddtoCart());
		WaitHelper.seleniumWait(pf.getSelectAddtoCart(), 30);
		CommonUtilitys.getActionClick(pf.getSelectAddtoCart());

	}

	@When("User should be able to click on the cart and checkout")
	public void user_should_be_able_to_click_on_the_cart_and_checkout() {

		log.info("User able to click to the shopping cart");
		CommonUtilitys.Highlighter(pf.getSelectShoppingCart());
		WaitHelper.seleniumWait(pf.getSelectShoppingCart(), 30);
		CommonUtilitys.getJSClick(pf.getSelectShoppingCart());

		log.info("User able to click for checkout");
		CommonUtilitys.Highlighter(pf.getSelectProccedToChkout());
		WaitHelper.seleniumWait(pf.getSelectProccedToChkout(), 30);
		CommonUtilitys.getActionClick(pf.getSelectProccedToChkout());
		

	}

	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
	
		
		log.info("User able to click for New Address");
		CommonUtilitys.Highlighter(pf.getClickOnNewAddress());
		WaitHelper.seleniumWait(pf.getClickOnNewAddress(), 30);
		CommonUtilitys.getJSClick(pf.getClickOnNewAddress());
		
		pf.ShippingDetails();
	
		
		
	}

	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {
		
		log.info("User able to click on place order");
		CommonUtilitys.Highlighter(pf.getClickPlaceOrder());
		WaitHelper.seleniumWait(pf.getClickPlaceOrder(), 30);
		//CommonUtilitys.pageDown();
		CommonUtilitys.getJSClick(pf.getClickPlaceOrder());
		
	}

	@Then("User should be able to verify the order number and get text on the screen “Thank you for your purchase!”")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen_thank_you_for_your_purchase() {
		
		
		
		
		log.info("User able to Verify Thank you Text");
		String expected1 = prop.getProperty("Text");
		CommonUtilitys.Highlighter(pf.getVerifyText());
		WaitHelper.seleniumWait(pf.getVerifyText(), 30);
		String actual1 = pf.getVerifyText().getText();
		CommonUtilitys.getJSClick(pf.getVerifyText());
		CommonUtilitys.getAssert(expected1, actual1);
		
		
		
	}

}
