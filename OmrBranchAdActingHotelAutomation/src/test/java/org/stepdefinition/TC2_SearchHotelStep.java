package org.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see SearchHotelPage Process For Searching The Hotels
 *
 */
public class TC2_SearchHotelStep extends BaseClass {
	
	
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * 
	 * @param loca
	 * @param hotels
	 * @param roomType
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultPerRoom
	 * @param childPerRoom
	 * @throws InterruptedException
	 * @see Select the all Elements and Click Search Done Here
	 */
		@Then("User Should Selected All Field {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldSelectedAllFieldAnd(String loca, String hotels, String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultPerRoom, String childPerRoom) throws InterruptedException {
	    
			pom.getSearchHotelPage().searchHotels(loca, hotels, roomType, noOfRooms, checkInDate, checkOutDate, adultPerRoom, childPerRoom);
			
	}
		
		/**
		 * 
		 * @param successMsg
		 * @see Verification Method for Successfully Get Into The Next Page
		 */
	@Then("User Should Verify After Searching Hotel Success message {string}")
	public void userShouldVerifyAfterSearchingHotelSuccessMessage(String successMsg) {
		
		//Assert.assertEquals("verify after success msg", successMsg, pom.getSelectHotelPage().getTxtSearchSuccessMsg().getText());
		
		Assert.assertEquals("verify after success msg", successMsg,elementGetText(pom.getSelectHotelPage().getTxtSearchSuccessMsg()));

	}

	/**
	 * 
	 * @param loca
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultPerRoom
	 * @throws InterruptedException
	 * @see Select Only the Mandotory Fields and Check the Process
	 */
	@Then("User Should Slect Mandatory Fields {string},{string},{string},{string} and {string}")
	public void userShouldSlectMandatoryFieldsAnd(String loca, String noOfRooms, String checkInDate, String checkOutDate, String adultPerRoom) throws InterruptedException {
		
		pom.getSearchHotelPage().searchHotels(loca, noOfRooms, checkInDate, checkOutDate, adultPerRoom);
	}
	
	/**
	 * 
	 * @param checkInError
	 * @param checkOutError
	 * @see Assertion Checking For Invalid Date 
	 */
	@Then("User Should Verify After Searching Hotel With Date Error Msg {string} and {string}")
	public void userShouldVerifyAfterSearchingHotelWithDateErrorMsgAnd(String checkInError, String checkOutError) {
		
		Assert.assertEquals("verify chckindate error msg", checkInError,elementGetText(pom.getSearchHotelPage().getErrorDatecheckInMsg()));
		Assert.assertEquals("verify chckoutdate error msg", checkOutError,elementGetText(pom.getSearchHotelPage().getErrorDateCheckOutMsg()));	

		//Assert.assertEquals("verify chckoutdate error msg", checkOutError, pom.getSearchHotelPage().getErrorDateCheckOutMsg().getText());	
	}

	/**
	 * @see Click the Search Button without Entering AnyFields
	 */
	@Then("User Should Click Search Without Entering Any Fields")
	public void userShouldClickSearchWithoutEnteringAnyFields() {
		
		elementClick(pom.getSearchHotelPage().getBtnSearch());
		
	}
	
	/**
	 * 
	 * @param searchHotelErrorMsg
	 * @see Assertion Checking For SeachHotelError Message
	 */
	@Then("User Should verify the Error Massage {string}")
	public void userShouldVerifyTheErrorMassage(String searchHotelErrorMsg) {
		
		Assert.assertEquals("verify error msg", searchHotelErrorMsg,elementGetText(pom.getSearchHotelPage().getLocationErrorMsg()));

	}




	




}
