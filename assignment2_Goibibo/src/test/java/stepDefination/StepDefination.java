package stepDefination;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage_Goibibo;
import resources.BaseClass;

public class StepDefination extends BaseClass {
	public WebDriver driver;
	public String ReviewFlightDetails;
	public LandingPage_Goibibo l1;
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver = initializedriver();
	}
	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		driver.get(arg1);
	}
	@When("^Select any one option in Page$")
	public void select_any_one_option_in_Page() throws Throwable {
		l1 = new LandingPage_Goibibo(driver);
		l1.oneoption();
	}
	@When("^Select From & Destination in page$")
	public void select_From_Destination_in_page() throws Throwable {
		l1.from();
		l1.sendblr();
		l1.to();
		l1.tohyderabad();
	}
	@When("^Select the Departure date and future Date in page$")
	public void select_the_Departure_date_and_future_Date_in_page() throws Throwable {
	l1.departure();
	l1.departuredate();
	}
	@When("^Select the traveller details and travel class$")
	public void select_the_traveller_details_and_travel_class() throws Throwable {
		l1.travellerdetails();
		l1.adultdetails();
		l1.childrendetails();
		l1.infantdetails();
		l1.selecttrvelcls();
		l1.closetraveller();
	}
	@When("^Search for the cheapest price and click on Book now button$")
	public void search_for_the_cheapest_price_and_click_on_Book_now_button() throws Throwable {
		l1.searchclck();
		l1.bookflight();
	}
	@Then("^Review the selection in the review page$")
	public void review_the_selection_in_the_review_page() throws Throwable {
		l1.reviewdetails();
		Thread.sleep(3000);
		getScreenShotPath(ReviewFlightDetails,driver);
	}
	@Then("^close all browsers$")
	public void close_all_browsers() throws Throwable {
		driver.quit();
	}


}
