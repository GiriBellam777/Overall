package BeanPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentDetails {
	
	@FindBy(id="txtCardholderName")
	WebElement name;
	
	@FindBy(id="txtDebit")
	WebElement cardNumber;
	
	@FindBy(id="txtCvv")
	WebElement cvv;
	
	@FindBy(id="txtMonth")
	WebElement expirationMonth;
	
	@FindBy(id="txtYear")
	WebElement expiartionYear;
	
	@FindBy(id="btnPayment")
	WebElement paymentButton;
	
	public PaymentDetails() {}

	public String getName() {
		return this.name.getAttribute("value");
	}

	public void setName(String name) {
		this.name.sendKeys(name);
	}

	public String getCardNumber() {
		return cardNumber.getAttribute("value");
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber.sendKeys(cardNumber);
	}

	public String getCvv() {
		return cvv.getAttribute("value");
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}

	public String getExpirationMonth() {
		return expirationMonth.getAttribute("value");
	}

	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth.sendKeys(expirationMonth);
	}

	public String getExpiartionYear() {
		return expiartionYear.getAttribute("value");
	}

	public void setExpiartionYear(String expiartionYear) {
		this.expiartionYear.sendKeys(expiartionYear);
	}
	
	public void clickPayment() {
		paymentButton.click();
	}
}

	
	
