package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage03 {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName1;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement creditNo;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardType;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expMonth;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expYear;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement book;

	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement myItinerary;

	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logOut;

	public PomPage03(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName1() {
		return firstName1;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditNo() {
		return creditNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getLogOut() {
		return logOut;
	}
}
