package com.mm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mm.qa.base.BaseClass;

public class LoginPage extends BaseClass{

	
	//Page Factory :
		@FindBy(id="lbl_val_l")
		WebElement Textbox1;
		
		@FindBy(id="lbl_val_2")
		WebElement Textbox2;
		
		@FindBy(id="lbl_val_3")
		WebElement Textbox3;
		
		@FindBy(id="lbl_val_4")
		WebElement Textbox4;
		
		@FindBy(id="lbl_val_5")
		WebElement Textbox5;
		
		@FindBy(xpath="//input[@id='txt_val_1']")
		WebElement Value1;
		
		@FindBy(xpath="//input[@id='txt_val_2']")
		WebElement Value2;
		
		@FindBy(xpath="//input[@id='txt_val_3']")
		WebElement Value3;
		
		@FindBy(xpath="//input[@id='txt_val_4']")
		WebElement Value4;
		
		@FindBy(xpath="//input[@id='txt_val_5']")
		WebElement Value5;
		
		
		@FindBy(css="input[id='txt_ttl_val']")
		WebElement TotalBalance;
	
}
