package in.capgemini.amazon.stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.capgemini.amazon.pagefactor.AmazonCartPage;
import in.capgemini.amazon.pagefactor.AmazonDeliveryAddress;
import in.capgemini.amazon.pagefactor.AmazonSignInPage;
import in.capgemini.amazon.util.AmazonTestBase;

public class HomePageStep extends AmazonTestBase {
	AmazonSignInPage asp = new AmazonSignInPage(driver);

	@Given("^user opens the browser$")
	public void user_opens_the_browser() throws Throwable {
		AmazonTestBase.initialization();
	}

	@When("^user clicks on Accounts & Lists$")
	public void user_clicks_on_Accounts_Lists() throws Throwable {
		AmazonSignInPage asp = new AmazonSignInPage(driver);
		asp.clickAccount();
	}

	@Then("^user enters username$")
	public void user_enters_username() throws Throwable {
		AmazonSignInPage asp = new AmazonSignInPage(driver);
		asp.login(prop.getProperty("username"));
	}

	@Then("^clicks on continue Button$")
	public void clicks_on_continue_Button() throws Throwable {
		AmazonSignInPage asp = new AmazonSignInPage(driver);
		asp.clickContinue();
	}

	@Then("^user enters password$")
	public void user_enters_password() throws Throwable {
		AmazonSignInPage asp = new AmazonSignInPage(driver);
		asp.login1(prop.getProperty("password"));
	}

	@Then("^clicks on Login Button$")
	public void clicks_on_Login_Button() throws Throwable {
		AmazonSignInPage asp = new AmazonSignInPage(driver);
		asp.clickSubmit();
	}

	@Then("^clicks on cart Page$")
	public void clicks_on_cart_Page() throws Throwable {
		AmazonCartPage acp = new AmazonCartPage(driver);
		acp.clickCart();
	}

	@Then("^clicks on proceed to Buy$")
	public void clicks_on_proceed_to_Buy() throws Throwable {
		AmazonCartPage acp = new AmazonCartPage(driver);
		acp.clickProceedToBuy();
	}

	@Then("^clicks on Delivery to this Address$")
	public void clicks_on_Delivery_to_this_Address() throws Throwable {
		AmazonDeliveryAddress ada = new AmazonDeliveryAddress(driver);
		ada.clickDeliveryAddress();
	}

	@Then("^clicks on continue$")
	public void clicks_on_continue() throws Throwable {
		AmazonDeliveryAddress ada = new AmazonDeliveryAddress(driver);
		ada.clickContinue();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		//driver.navigate().back();
	}

	@Then("^clicks on Signout link$")
	public void clicks_on_Signout_link() {
		AmazonDeliveryAddress ada = new AmazonDeliveryAddress(driver);
		ada.clickSignout();
	}
}
