package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author sarav
 *@date 02/10/2022
 *@see Cancel The Generated Order Id and also Existing OrderId
 */
public class CancelBookingPage extends BaseClass {
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[contains(@id,'btn_id_')]")
	private WebElement cancelOrderIdMsg;
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement likBookItinary;

	@FindBy(id = "order_id_text")
	private WebElement txtSearchOrderId;

	@FindBy(id="search_result_error")
	private WebElement cancelSuccessMsg;
	
	public WebElement getCancelSuccessMsg() {
		return cancelSuccessMsg;
	}
	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;
	
//	@FindBy(name = "ids[]")
//	private WebElement slctToCancel;
	
	@FindBy(xpath = "//input[contains(@id,'btn_id_')]")
	private WebElement btnExistIdCancel;
	
	@FindBy(name = "cancelall")
	private WebElement btnCancel;
	
	@FindBy(xpath="//label[contains(text(),'The Booking has been cancelled.')]")
	private WebElement txtCancelBookingMsg;
	
	@FindBy(xpath="(//input[contains(@id,'order_id')])[5]")
	private WebElement existingOrderId;
	

	public WebElement getExistingOrderId() {
		return existingOrderId;
	}

	public WebElement getTxtCancelBookingMsg() {
		return txtCancelBookingMsg;
	}

	public WebElement getBtnExistIdCancel() {
		return btnExistIdCancel;
	}
	public WebElement getLikBookItinary() {
		return likBookItinary;
	}
	public WebElement getTxtSearchOrderId() {
		return txtSearchOrderId;
	}
	public WebElement getBtnGo() {
		return btnGo;
	}
//	public WebElement getSlctToCancel() {
//		return slctToCancel;
//	}
	public WebElement getBtnCancel() {
		return btnCancel;
	}
	public WebElement getCancelOrderIdMsg() {
		return cancelOrderIdMsg;
	}
	
/**
 * 
 * @param id
 * @throws InterruptedException
 * @see Cancel The Generated OrderId
 */
	public void cancelOrderId(String id) throws InterruptedException {
		
		
        elementClick(getLikBookItinary());
        
		elementSendkeys(getTxtSearchOrderId(), id);
		
		elementClick(getBtnGo());
		
		elementClick(getCancelOrderIdMsg());
		
		getSimpleAlert();
	}

}
