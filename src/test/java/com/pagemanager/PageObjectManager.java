package com.pagemanager;

import org.stepdefinition.CommonSteps;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmationPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see SingleTon Process For Creating single Object To all classes
 *
 */
public class PageObjectManager {

	private LoginPage logInPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private CancelBookingPage cancelBookingPage;
	private CommonSteps commonSteps;

	/**
	 * 
	 * @return commonSteps
	 * @see Commonstep Object Creation
	 * 
	 */
	public CommonSteps getCommonSteps() {
		return (commonSteps == null) ? commonSteps = new CommonSteps() : commonSteps;
	}

	/**
	 * 
	 * @return logInPage
	 * @see LoginPage Object Creation
	 */
	public LoginPage getLogInPage() {
		return (logInPage == null) ? logInPage = new LoginPage() : logInPage;
	}

	/**
	 * 
	 * @return searchHotelPage
	 * @see SeachHotelPage Object Creation
	 */
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}

	/**
	 * 
	 * @return selectHotelPage
	 * @see SelectHotelPage Object Creation
	 */
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage == null) ? selectHotelPage = new SelectHotelPage() : selectHotelPage;
	}

	/**
	 * 
	 * @return bookHotelPage
	 * @see BookHotelPage Object creation
	 */
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
	}

	/**
	 * 
	 * @return bookingConfirmationPage
	 * @see BookingconfirmationPage Object Creation
	 */
	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage == null) ? bookingConfirmationPage = new BookingConfirmationPage()
				: bookingConfirmationPage;
	}

	/**
	 * 
	 * @return cancelBookingPage
	 * @see CancelBookingPage Object creation
	 */
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage == null) ? cancelBookingPage = new CancelBookingPage() : cancelBookingPage;
	}

}
