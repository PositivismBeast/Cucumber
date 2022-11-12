
package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see StepDefinitionFile For Login Process and Assertion Check
 *
 */
public class TC1_LoginStep extends BaseClass{

	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see Getting Into the LoginPage
	 */
	@Given("User is on AdActing Page")
	public void userIsOnAdActingPage() throws FileNotFoundException, IOException {
		

	}

	/**
	 * 
	 * @param username
	 * @param password
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InterruptedException
	 * @see Perform the Login Page By Entering Username and Password
	 */
	@When("User Should Perform Login {string},{string}")
	public void userShouldPerformLogin(String username, String password) throws FileNotFoundException, IOException, InterruptedException {
		pom.getLogInPage().logIn(username,password);
		
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * @throws AWTException
	 * @throws InterruptedException
	 * @see Perform the Login Page By Using Enter Key
	 */

	@When("User Should Perform Login {string},{string} With Enter key")
	public void userShouldPerformLoginWithEnterKey(String username, String password) throws AWTException, InterruptedException {
		pom.getLogInPage().loginWithEnterKey(username, password);

	}
	
	/**
	 * 
	 * @param loginErrorMsg
	 * @see Verify Process For Invalid Login Page
	 */
	
	@Then("User Should Verify After Login With Invalid Credential Error msg Contains {string}")
	public void userShouldVerifyAfterLoginWithInvalidCredentialErrorMsgContains(String loginErrorMsg) {

	//Assert.assertTrue("Invalid Login Error Msg", pom.getLogInPage().getTextLoginErrorMsg().getText().contains(loginErrorMsg));
	
	Assert.assertTrue("Invalid Login Error Msg",elementGetText( pom.getLogInPage().getTextLoginErrorMsg()).contains(loginErrorMsg));

	
	}


	
	
	
	
	
	
	
	
	
	
	
}
