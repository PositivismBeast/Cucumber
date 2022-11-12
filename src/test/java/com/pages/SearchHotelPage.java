package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see SeachHotelPage For Fineelements and Write Business Logics
 *
 */
public class SearchHotelPage extends Baseclass{
	
	public SearchHotelPage() {	
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dDnlocation;
	
	@FindBy(id="hotels")
	private WebElement dDnhotel;
	
	@FindBy(id="room_type")
	private WebElement dDnroomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnnoOfRoom;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement dDnadultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement dDnChildPerRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	@FindBy(id="checkin_span")
	private WebElement errorDatecheckInMsg;
	
	@FindBy(id="checkout_span")
	private WebElement errorDateCheckOutMsg;
	
	@FindBy(id="location_span")
	private WebElement locationErrorMsg;
	
	
	
	public WebElement getLocationErrorMsg() {
		return locationErrorMsg;
	}

	public WebElement getErrorDatecheckInMsg() {
		return errorDatecheckInMsg;
	}

	public WebElement getErrorDateCheckOutMsg() {
		return errorDateCheckOutMsg;
	}
	
	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getdDnhotel() {
		return dDnhotel;
	}

	public WebElement getdDnroomType() {
		return dDnroomType;
	}

	public WebElement getdDnnoOfRoom() {
		return dDnnoOfRoom;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnadultsPerRoom() {
		return dDnadultsPerRoom;
	}

	public WebElement getdDnChildPerRoom() {
		return dDnChildPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void clickCommonBtn() {
		elementClick(getBtnSearch());

	}
	
	/**
	 * 
	 * @param loca
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultPerRoom
	 * @throws InterruptedException
	 * @see CommonStep for SearchHotelPage Use For all Methods Inside Class
	 */
	public void searchHotelsCommonSteps(String loca,String noOfRooms,String checkInDate
			,String checkOutDate,String adultPerRoom) throws InterruptedException {
		
		selectoptionByText(getdDnlocation(),loca);
		selectoptionByText(getdDnnoOfRoom(),noOfRooms );
		
		elementClear(getTxtCheckInDate());
		elementSendkeys(getTxtCheckInDate(), checkInDate);
		
		elementClear(getTxtCheckOutDate());
		elementSendkeys(getTxtCheckOutDate(), checkOutDate);
		selectoptionByText(getdDnadultsPerRoom(),adultPerRoom);
		
	}
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
	 * 
	 * @see Use for Select all Elements and Move Into Next Page
	 * @see And For Check What if Gave Invalid Date
	 */
	
	public void searchHotels(String loca,String hotels ,String roomType,String noOfRooms,String checkInDate
			,String checkOutDate,String adultPerRoom,String childPerRoom) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		searchHotelsCommonSteps(loca, noOfRooms, checkInDate, checkOutDate, adultPerRoom);		
		selectoptionByText(getdDnhotel(),hotels);
		selectoptionByText(getdDnroomType(),roomType);
		selectoptionByText(getdDnChildPerRoom(),childPerRoom);
		clickCommonBtn();
	
	}
	
	/**
	 * 
	 * @param loca
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultPerRoom
	 * @throws InterruptedException
	 * @see Use For Select Only The Mandotary Fields
	 */
	public void searchHotels(String loca,String noOfRooms,String checkInDate,
			String checkOutDate,String adultPerRoom) throws InterruptedException {
		searchHotelsCommonSteps(loca, noOfRooms, checkInDate, checkOutDate, adultPerRoom);
		clickCommonBtn();	
		
	}
	
	/**
	 * @see Without Select any elements Click the Continue
	 */
	public void searchHotels() {

		clickCommonBtn();
	}
	
	
	
	

}
