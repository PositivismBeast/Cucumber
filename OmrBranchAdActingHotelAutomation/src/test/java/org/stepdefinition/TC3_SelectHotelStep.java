package org.stepdefinition;



import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;


/**
 * 
 * @author sarav
 *@date 02/10/2022
 *@see Selecting The Hotel Process Done Here with Valid and Invalid Selections
 */
public class TC3_SelectHotelStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();
	
	
/**
 * @see Select The Hotel and Click
 */
	@Then("User Should Select Hotel")
	public void userShouldSelectHotel() {
		
	   pom.getSelectHotelPage().selectHotelAndClick();;
	}
	
	/**
	 * 
	 * @param txtBookHotelMsg
	 * @see Assertion Check for the Booking Confirmation Message
	 */
	@Then("User Should Verify After Booking Confirmation {string}")
	public void userShouldVerifyAfterBookingConfirmation(String txtBookHotelMsg) {
		
		Assert.assertEquals("verify after select hotel", txtBookHotelMsg,elementGetText( pom.getBookHotelPage().getTxtSelectHotelSuccessMsg()));
	    
	}


/**
 * @see Enter The Click WithOut Selecting Any Hotel
 */
	@Then("User Should Click Continue WithOut Select Hotel")
	public void userShouldClickContinueWithOutSelectHotel() {
	   
		pom.getSelectHotelPage().clickContinueWithoutSelectHotel();
		
	}
	
	/**
	 * 
	 * @param textSelectHotelMsg
	 * Assertion Check for Without Selecting Hotel
	 */
	@Then("User Should Verify Error Msg {string}")
	public void userShouldVerifyErrorMsg(String textSelectHotelMsg) {
		Assert.assertEquals("select hotel Error Msg", textSelectHotelMsg,elementGetText(pom.getSelectHotelPage().getTxtHotelErrorMsg()));
	    
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
