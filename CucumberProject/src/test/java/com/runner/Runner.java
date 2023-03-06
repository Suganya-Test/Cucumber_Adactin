package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\Documents\\Java\\CucumberProject\\src\\test\\java\\com\\feature\\adactin.feature",
                  glue="com.stepdefinition",
                  plugin= {"pretty","html:target/Cucumber.html",
                		  "json:target/Cucumber.jason",
                		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver=BaseClass.browser("Chrome");
	}
	
}
