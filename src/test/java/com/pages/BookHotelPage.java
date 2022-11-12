package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

import io.cucumber.datatable.DataTable;

/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see BookHotelPage for Book the Hotel By Entering Personal Details
 *
 */
public class BookHotelPage extends Baseclass{
	public BookHotelPage() {
		
PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement txtSelectHotelSuccessMsg;
	
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	@FindBy(id="address")
	private WebElement txtbillingAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditCardNum;
	
	@FindBy(id="cc_type")
	private WebElement dDnCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnExpMonth;
	 
	@FindBy(id="cc_exp_year")
	private WebElement dDnExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCcvNum;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
	@FindBy(id="first_name_span")
	private WebElement txtFirstNameError;
	
	@FindBy(id="last_name_span")
	private WebElement txtLastNameError;
	
	@FindBy(id="address_span")
	private WebElement txtAddressError;

	@FindBy(id="cc_num_span")
	private WebElement txtCardNumError;
	
	@FindBy(id="cc_type_span")
	private WebElement textCardTypeError;
	
	@FindBy(id="cc_expiry_span")
	private WebElement textExMontherror;
	
	@FindBy(id="cc_cvv_span")
	private WebElement textCvvError;
	
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement bookSuccessMsg;
	
	
	public WebElement getTxtSelectHotelSuccessMsg() {
		return txtSelectHotelSuccessMsg;
	}

	public WebElement getBookSuccessMsg() {
		return bookSuccessMsg;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	
	public WebElement getTxtbillingAddress() {
		return txtbillingAddress;
	}
	
	public WebElement getTxtCreditCardNum() {
		return txtCreditCardNum;
	}
	
	public WebElement getdDnCardType() {
		return dDnCardType;
	}
	
	public WebElement getdDnExpMonth() {
		return dDnExpMonth;
	}
	
	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}
	public WebElement getTxtCcvNum() {
		return txtCcvNum;
	}
	public WebElement getTextCvvError() {
		return textCvvError;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public WebElement getTxtFirstNameError() {
		return txtFirstNameError;
	}
	public WebElement getTxtLastNameError() {
		return txtLastNameError;
	}
	public WebElement getTxtAddressError() {
		return txtAddressError;
	}
	public WebElement getTxtCardNumError() {
		return txtCardNumError;
	}
	public WebElement getTextCardTypeError() {
		return textCardTypeError;
	}
	public WebElement getTextExMontherror() {
		return textExMontherror;
	}
	
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param dataTable
	 * @throws InterruptedException
	 * @see Book the Hotel By Entering Personal Details with Datatable and Continue
	 */
	public void bookHotel(String firstName, String lastName,String address, DataTable dataTable) throws InterruptedException {
		
		elementSendkeys(getTxtFirstName(), firstName);
		elementSendkeys(getTxtLastName(), lastName);
		elementSendkeys(getTxtbillingAddress(), address);
		List<Map<String, String>> dt = dataTable.asMaps();
		Map<String, String> map = dt.get(1);
		elementSendkeys(getTxtCreditCardNum(), map.get("Credit Card No."));
		selectoptionByText(getdDnCardType(), map.get("Credit Card Type"));
		selectoptionByText(getdDnExpMonth(), map.get("Expiry Month"));
		selectoptionByText(getdDnExpYear(), map.get("Expiry Year"));
		elementSendkeys(getTxtCcvNum(), map.get("CVV Number"));
		
		elementClick(getBtnBookNow());
		
	}
	/**
	 * @see Use for WithOut Selecting any Element Click continue
	 */
	
	public void bookHotel() {
		elementClick(getBtnBookNow());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
