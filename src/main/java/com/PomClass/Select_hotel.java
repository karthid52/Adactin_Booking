package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	
	
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continues;
	
	public Select_hotel(WebDriver abc) {
		this.driver=abc;
		PageFactory.initElements(driver, this);	
		
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinues() {
		return continues;
	}
	

}
