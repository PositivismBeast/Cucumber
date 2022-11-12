package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author sarav
 * @date 02/10/2022
 *@see Confirm the Booking By Getting The OrderId
 */
public class BookingConfirmationPage extends BaseClass{
	
	
	public BookingConfirmationPage() {

		PageFactory.initElements(driver, this);
	
	
	}
	@FindBy(id="order_no")
	private WebElement orderId;
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement bookingmsg;

	public WebElement getBookingmsg() {
		return bookingmsg;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	/**
	 * 
	 * @return String
	 * @see Use For Getting OrderId
	 */
	
	public String orderId() {
		String attributeid = elementGetAttributeValue(getOrderId());
		return attributeid;
		

	}
	
	
	
	
	
	
	
	
	
	

}
