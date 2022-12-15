package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	@FindBy(xpath = "//img[@title='Create Contact...']") 
	private WebElement createContactButton;
		
		public ContactsPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void clickCreateContact() {
			createContactButton.click();
		}
}
