package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;


/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see Use For Select particular Hotel
 *
 */
public class SelectHotelPage extends Baseclass{
	
	public SelectHotelPage() {
PageFactory.initElements(driver, this);

}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnClick;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
		
	@FindBy(xpath="//label[text()='Please Select a Hotel']")
	private WebElement txtHotelErrorMsg;
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement txtSearchSuccessMsg;
	
	public WebElement getTxtSearchSuccessMsg() {
		return txtSearchSuccessMsg;
	}
	
	public WebElement getTxtHotelErrorMsg() {
		return txtHotelErrorMsg;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}


	public WebElement getBtnContinue() {
		return btnContinue;
	}

	
	/**
	 * @see Select Hotel and Continue
	 */
	public void selectHotelAndClick() {
		
		elementClick(getBtnClick());
		
	}
	/**
	 * @see WithOut Select hotel Click Continue
	 */
	public void clickContinueWithoutSelectHotel() {	
		elementClick(getBtnContinue());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
