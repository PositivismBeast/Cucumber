package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;


/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see Cancellation Process For Generated OrderId
 *
 */
public class TC5_CancelBookingStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * 
	 * @throws InterruptedException
	 * @see Delect the Generated OrderId Process Done Here
	 */
	@Then("User Should Cancel The Generated OrderId")
	public void userShouldCancelTheGeneratedOrderId() throws InterruptedException {
		
		String id = pom.getBookingConfirmationPage().orderId();
		pom.getCancelBookingPage().cancelOrderId(id);
	    
	}
	/**
	 * 
	 * @param txtCancelBookingMsg
	 * @Assertion Verification for Successfully Deleted OrderId
	 */
	@Then("User Should Verify Cancelled OrderId Success Msg {string}")
	public void userShouldVerifyCancelledOrderIdSuccessMsg(String txtCancelBookingMsg) {
		
	//	Assert.assertEquals("verify after cancel", txtCancelBookingMsg, pom.getCancelBookingPage().getCancelSuccessMsg().getText());
		
			Assert.assertEquals("verify after cancel", txtCancelBookingMsg, elementGetText(pom.getCancelBookingPage().getCancelSuccessMsg()));

	
	}

	/**
	 * 
	 * @param orderId
	 * @throws InterruptedException
	 * @see Cancel the Existing Order Id Process Done Here
	 */
	@Then("User Should Cencel the Existing OrderId {string}")
	public void userShouldCencelTheExistingOrderId(String orderId) throws InterruptedException {
		
	pom.getCancelBookingPage().cancelOrderId(orderId);
	   
	}
	






}
