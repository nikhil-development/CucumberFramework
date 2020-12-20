package com.mm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mm.qa.base.BaseClass;

public class LoginPage extends BaseClass{

	
	//Page Factory :
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement loginBtn;
		
		@FindBy(xpath="//button[contains(text(),'Sign Up')]")
		WebElement signUpBtn;
		
		@FindBy(xpath="//img[contains(@class,'img-responsive')]")
		WebElement crmLogo;
	
}
