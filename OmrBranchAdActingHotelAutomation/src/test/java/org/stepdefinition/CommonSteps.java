package org.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;
import com.pages.SearchHotelPage;

import io.cucumber.java.en.Then;

/**
 * 
 * @author sarav
 *@date 02/10/2022
 *@see CommonStep For All The Step definition Classes
 */
public class CommonSteps extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * 
	 * @param expectedLoginWelcomemsg
	 * @see Success Message For Valid Login process
	 */
	@Then("User Should Verify After Login Seccess Massage {string}")
	public void userShouldVerifyAfterLoginSeccessMassage(String expectedLoginWelcomemsg) {
		
	
		Assert.assertEquals("verify after login success msg", expectedLoginWelcomemsg, elementGetAttributeValue(pom.getLogInPage().getTextSuccessMsg()));
		
	}

}
