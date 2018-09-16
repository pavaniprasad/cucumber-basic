package com.techstack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "userId")
	public WebElement txtUserName;
	@FindBy(how = How.NAME, using = "password")
	public WebElement txtPassword;
	
	@FindBy(how=How.NAME,using="login")
	public WebElement btnLogin;
	
	public void Login (String userName, String password) {
		txtUserName.sendKeys(userName);
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.submit();
	}
}
