package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see Use For Book The Hotel By Entering Personal Details
 *
 */
public class TC4_BookHotelStep extends Baseclass{
	
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param dataTable
	 * @throws InterruptedException
	 * @see Select all Elements and Click Booking Process Done Here
	 */
	@Then("User Should Enter All Fields For Booking {string},{string} and {string}")
	public void userShouldEnterAllFieldsForBookingAnd(String firstName, String lastName, String address, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		pom.getBookHotelPage().bookHotel(firstName, lastName, address,dataTable);
		
	}
	
	/**
	 * 
	 * @param txtBookingConfirm
	 * @see Varification Process For Booking Confirmation
	 */
	@Then("User Should Verify Confirm Msg {string}")
	public void userShouldVerifyConfirmMsg(String txtBookingConfirm) {
		Assert.assertEquals("verify booking hotel success msg", txtBookingConfirm,elementGetText(pom.getBookingConfirmationPage().getBookingmsg()));
	    
	}
	
	/**
	 * @see Click Booking without any Fields Process
	 */

	@Then("User Should Click WithOut Select Any Fields")
	public void userShouldClickWithOutSelectAnyFields() {
		pom.getBookHotelPage().bookHotel();
	    
	}
	
	/**
	 * 
	 * @param txtFirstNameErrorMsg
	 * @param txtLastNameErrorMsg
	 * @param txtAdddressErrorMsg
	 * @param txtCardNumErrorMsg
	 * @param txtCardTypeErrorMsg
	 * @param txtExmonthErrorMsg
	 * @param txtCvvErrorMsg
	 * 
	 * @see Assertion Checking for without Selecting Any Fields Process 
	 */
	@Then("User Should Verify Error Msg {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyErrorMsgAnd(String txtFirstNameErrorMsg, String txtLastNameErrorMsg, String txtAdddressErrorMsg, String txtCardNumErrorMsg, String txtCardTypeErrorMsg, String txtExmonthErrorMsg, String txtCvvErrorMsg) {
	    
		Assert.assertEquals("verify firstname error msg", txtFirstNameErrorMsg,elementGetText( pom.getBookHotelPage().getTxtFirstNameError()));
		Assert.assertEquals("verify lastname error msg", txtLastNameErrorMsg,elementGetText( pom.getBookHotelPage().getTxtLastNameError()));
		Assert.assertEquals("verify address error msg", txtAdddressErrorMsg, elementGetText(pom.getBookHotelPage().getTxtAddressError()));
		Assert.assertEquals("verify card number error msg", txtCardNumErrorMsg,elementGetText(pom.getBookHotelPage().getTxtCardNumError()));
		Assert.assertEquals("verify card type error msg", txtCardTypeErrorMsg,elementGetText(pom.getBookHotelPage().getTextCardTypeError()));
		Assert.assertEquals("verify exmonth error msg", txtExmonthErrorMsg,elementGetText(pom.getBookHotelPage().getTextExMontherror()));
		Assert.assertEquals("verify cvv error msg", txtCvvErrorMsg,elementGetText(pom.getBookHotelPage().getTextCvvError()));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



		
		
		
		
		
		
	}



