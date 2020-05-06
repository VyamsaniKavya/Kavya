package in.capgemini.amazon.pagefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.capgemini.amazon.util.AmazonTestBase;

public class AmazonCartPage extends AmazonTestBase{
	@FindBy(id="nav-cart")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	WebElement proceed;
	// Initializing the Page Objects:
		public AmazonCartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void clickCart() {
			cart.click();
		}
		public void clickProceedToBuy() {
			proceed.click();
		}
	
}
