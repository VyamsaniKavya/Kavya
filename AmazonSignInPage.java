package in.capgemini.amazon.pagefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.capgemini.amazon.util.AmazonTestBase;

public class AmazonSignInPage extends AmazonTestBase {
	// Page Factory
	@FindBy(xpath = "//a")
	WebElement Links;
	@FindBy(id = "nav-link-accountList")
	WebElement account;
	@FindBy(id = "ap_email")
	WebElement unm;
	@FindBy(id = "continue")
	WebElement cont;
	@FindBy(id = "ap_password")
	WebElement pwd;
	@FindBy(id = "signInSubmit")
	WebElement submit;

	// Initialization
	public AmazonSignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void clickAccount() {
		account.click();
	}

	public void login(String un) {
		unm.sendKeys(un);
	}

	public void clickContinue() {
		cont.click();
	}

	public void login1(String pswd) {
		pwd.sendKeys(pswd);
	}

	public void clickSubmit() {
		submit.click();
	}

}
