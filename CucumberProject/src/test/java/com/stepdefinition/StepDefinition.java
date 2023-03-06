package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;
import com.pom.PomPage01;
import com.pom.PomPage02;
import com.pom.PomPage03;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	PomPage01 p = new PomPage01(driver);
	PomPage02 p2 = new PomPage02(driver);
	PomPage03 p3 = new PomPage03(driver);

	@Given("User launch the url")
	public void user_launch_the_url() {

		getUrl("https://adactinhotelapp.com/");
	}

	@When("User click the username and send the username {string}")
	public void user_click_the_username_and_send_the_username(String string) {
		p.getUserName().sendKeys(string);
	}

	@When("User click the password and send the password {string}")
	public void user_click_the_password_and_send_the_password(String string) {
		p.getPassWord().sendKeys(string);
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		p.getLogIn().click();
	}

	@Then("See page shown")
	public void see_page_shown() {
		System.out.println("Next page");
	}

	@When("User click the location and select the location")
	public void user_click_the_location_and_select_the_location() {
		selection(p2.getLocation(), "byvalue", "London");
	}

	@When("User click the hotels and select the hotel")
	public void user_click_the_hotels_and_select_the_hotel() {
		selection(p2.getHotel(), "byvalue", "Hotel Sunshine");
	}

	@When("User click the room type and select the room type")
	public void user_click_the_room_type_and_select_the_room_type() {
		selection(p2.getRoomType(), "byvalue", "Super Deluxe");
	}

	@When("User click the check in date and send {string}")
	public void user_click_the_check_in_date_and_send(String string) {
		p2.getCheckInDate().sendKeys(string);
	}

	@When("User click the chect out date and send {string}")
	public void user_click_the_chect_out_date_and_send(String string) {
		p2.getCheckOutDate().sendKeys(string);
	}

	@When("User click the adults per room and select the option")
	public void user_click_the_adults_per_room_and_select_the_option() {
		selection(p2.getAdult(), "byvalue", "2");
	}

	@When("User click the children per room and select the option")
	public void user_click_the_children_per_room_and_select_the_option() {
		selection(p2.getChildren(), "byvalue", "1");
	}

	@When("User click the search button")
	public void user_click_the_search_button() {
		p2.getSearch().click();
	}

	@When("User select the hotel")
	public void user_select_the_hotel() {
		p2.getSelect().click();
	}

	@When("user click the continue button")
	public void user_click_the_continue_button() {
		p2.getConti().click();
	}

	@When("User click the First Name and send {string}")
	public void user_click_the_first_name_and_send(String string) {
		p3.getFirstName1().sendKeys(string);
	}

	@When("User click the Last name and send {string}")
	public void user_click_the_last_name_and_send(String string) {
		p3.getLastName().sendKeys(string);
	}

	@When("User click the Billing Address and send {string}")
	public void user_click_the_billing_address_and_send(String string) {
		p3.getAddress().sendKeys(string);
	}

	@When("User click the Credit Card No and send card number")
	public void user_click_the_credit_card_no_and_send_card_number() {
		p3.getCreditNo().sendKeys("1234569871023450");
	}

	@When("User click the Credit Card Type and select the card type")
	public void user_click_the_credit_card_type_and_select_the_card_type() {
		selection(p3.getCardType(), "byvalue", "MAST");
	}

	@When("User click the Expiry month and select the month")
	public void user_click_the_expiry_month_and_select_the_month() {
		selection(p3.getExpMonth(), "byvalue", "12");
	}

	@When("User click the Expiry year and select the year")
	public void user_click_the_expiry_year_and_select_the_year() {
		selection(p3.getExpYear(), "byvalue", "2022");
	}

	@When("User click thhe CVV Number and send number")
	public void user_click_thhe_cvv_number_and_send_number() throws InterruptedException {
		p3.getCvv().sendKeys("111");
		Thread.sleep(2000);
	}

	@When("User click the Book Now button")
	public void user_click_the_book_now_button() throws InterruptedException {
		p3.getBook().click();
		Thread.sleep(3000);
	}

	@When("User click the My Itinerary")
	public void user_click_the_my_itinerary() {
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf(p3.getMyItinerary()));
		
		p3.getMyItinerary().click();
	}

	@When("User click the logout button")
	public void user_click_the_logout_button() {
		p3.getLogOut().click();
		driver.quit();
	}

}
