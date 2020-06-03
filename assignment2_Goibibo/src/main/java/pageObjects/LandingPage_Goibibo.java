package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage_Goibibo {
	public WebDriver ldriver;

	public LandingPage_Goibibo(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//span[@id='oneway']")
	WebElement clickcategory;
	@FindBy(xpath = "//input[@id='gosuggest_inputSrc']")
	WebElement fromclick;
	@FindBy(xpath = "//input[@id='gosuggest_inputSrc']")
	WebElement fromblr;

	@FindBy(xpath = "//input[@id='gosuggest_inputDest']")
	WebElement toclick;
	@FindBy(xpath = "//input[@id='gosuggest_inputDest']")
	WebElement tohyd;
	@FindBy(xpath = "//input[@id='departureCalendar']")
	WebElement depart;
	@FindBy(xpath = "//div[@id='fare_20200630']")
	WebElement departdate;
	@FindBy(xpath = "//span[@class='dF alignItemsCenter ico14 textOverflow blueGrey']")
	WebElement traveller;
	@FindBy(xpath = "//button[@id='adultPaxPlus']")
	WebElement adult;
	@FindBy(xpath = "//button[@id='childPaxPlus']")
	WebElement children;
	@FindBy(xpath = "//button[@id='infantPaxPlus']")
	WebElement infant;
	@FindBy(xpath = "//select[@id='gi_class']")
	WebElement travelclass;
	@FindBy(xpath = "//a[@id='pax_close']")
	WebElement closetab;
	@FindBy(xpath = "//button[@id='gi_search_btn']")
	WebElement search;
	@FindBy(xpath = "//span[contains(text(),'Ticket Details')]")
	WebElement details;
	@FindBy(xpath = "//input[@class='button fr fltbook fb widthF105 fb quicks']")
	WebElement book;

	public void oneoption() {
		clickcategory.click();
	}

	public void from() {
		fromclick.click();
	}

	public void sendblr() throws InterruptedException {
		fromblr.sendKeys("BENGALURU");
		Thread.sleep(3000);
		fromblr.sendKeys(Keys.ARROW_DOWN);
		fromblr.sendKeys(Keys.ENTER);
	}

	public void to() {
		toclick.click();
	}

	public void tohyderabad() throws InterruptedException {
		tohyd.sendKeys("HYD");
		Thread.sleep(3000);
		tohyd.sendKeys(Keys.ARROW_DOWN);
		tohyd.sendKeys(Keys.ENTER);

	}

	public void departure() {
		depart.click();
	}

	public void departuredate() {
		departdate.click();
	}

	public void travellerdetails() {
		traveller.click();
	}

	public void adultdetails() {
		adult.click();
	}

	public void childrendetails() {
		children.click();
	}

	public void infantdetails() {
		infant.click();
	}

	public void selecttrvelcls() {
		Select cls = new Select(travelclass);
		cls.selectByVisibleText("Economy");
	}

	public void closetraveller() {
		closetab.click();
	}

	public void searchclck() {
		search.click();
	}
	

	public void reviewdetails() {
		System.out.println(details.getText());
	}

	public void bookflight() throws InterruptedException {
		Thread.sleep(3000);
		book.click();
	}
}
