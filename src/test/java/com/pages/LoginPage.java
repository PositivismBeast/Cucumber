package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;
/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see LoginPage For Findelements and Write the Business logics
 *
 */
public class LoginPage extends Baseclass{
	public LoginPage() {
PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="username")
	private WebElement txtuserName;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(id="login")
	private WebElement btnClick;
	@FindBy(className="auth_error")
	private WebElement textLoginErrorMsg;
	@FindBy(id="username_show")
	private WebElement textSuccessMsg;
	
	public WebElement getTextSuccessMsg() {
		return textSuccessMsg;
	}
	public WebElement getTextLoginErrorMsg() {
		return textLoginErrorMsg;
	}
	public WebElement getTxtuserName() {
		return txtuserName;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}
	
	/**
	 * 
	 * @param userName
	 * @param password
	 * @throws InterruptedException
	 * @see CommonStep For Login Process We Can Use All methods In this Class
	 */
	public void loginCommonSteps(String userName, String password) throws InterruptedException {

		elementSendkeys(txtuserName, userName);
		elementSendkeys(txtpassword, password);
	}
	
	/**
	 * 
	 * @param userName
	 * @param password
	 * @throws InterruptedException
	 * @see Login Process For Valid and Invalid Username and Password
	 * 
	 */
	public void logIn(String userName,String password) throws InterruptedException {
		loginCommonSteps(userName, password);
		
		elementClick(btnClick);
		Thread.sleep(5000);
		
	}
	
	/**
	 * 
	 * @param userName
	 * @param password
	 * @throws AWTException
	 * @throws InterruptedException
	 * @see Login Using EnterKey
	 * 
	 */
	public void loginWithEnterKey(String userName,String password) throws AWTException, InterruptedException {

		loginCommonSteps(userName, password);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);		
	}

}
