package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage02 {

	public static WebDriver driver;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;//value London
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;//value Hotel Sunshine
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;//value Super Deluxe
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkInDate; //sendKeys 01/11/2022
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOutDate;//sendKeys 05/11/2022
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;//value 2
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement children;//value 1 
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;//click
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement select;

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement conti;

	public PomPage02(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch() {
		return search;
	}
	public WebElement getSelect() {
		return select;
	}

	public WebElement getConti() {
		return conti;
	}

	
}
