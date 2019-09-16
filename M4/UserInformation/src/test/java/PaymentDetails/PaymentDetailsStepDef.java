package PaymentDetails;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import BeanPages.PaymentDetails;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentDetailsStepDef {
	
	private WebDriver driver;
	private PaymentDetails payment;
	
	
	@Before
	public void setUpStepEnv() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\girprasa\\Desktop\\selenium\\chromedriver\\chromedriver.exe" );
}
	
	@Given("^user is on Payment Details page$")
	public void user_is_on_Payment_Details_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("C:\\Users\\girprasa\\Desktop\\M4\\UserInformation\\PaymentDetails.html");
		payment = new PaymentDetails();
		PageFactory.initElements(driver, payment); 
	}

	@When("^user enters loads the page$")
	public void user_enters_loads_the_page() throws Throwable {
	    
	}

	@Then("^valid page should open$")
	public void valid_page_should_open() throws Throwable {
		String expectedPageTitle = "Payment Details";
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		driver.close();
	}

	@When("^user enters invalid name$")
	public void user_enters_invalid_name() throws Throwable {
		payment.setName("");
		payment.clickPayment();
	}

	@Then("^displays 'Please fill name'$")
	public void displays_Please_fill_name() throws Throwable {
		String expectedMessage = "Please fill the Card holder name";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Debit Card Number$")
	public void user_enters_invalid_Debit_Card_Number() throws Throwable {
		payment.setName("Nishitha");
		payment.clickPayment();
	}

	@Then("^displays 'Please fill Debit Card Number'$")
	public void displays_Please_fill_Debit_Card_Number() throws Throwable {
		String expectedMessage = "Please fill the Debit card Number";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	@When("^user enters invalid CVV$")
	public void user_enters_invalid_CVV() throws Throwable {
		payment.setName("Nishitha");
		payment.setCardNumber("9928282558525");
		payment.setCvv("");
		payment.clickPayment();
	}
	@Then("^displays 'Please fill CVV'$")
	public void displays_Please_fill_CVV() throws Throwable {
		String expectedMessage = "Please fill the CVV";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}
	

	@When("^user enters invalid expiration month$")
	public void user_enters_invalid_expiration_month() throws Throwable {
		payment.setName("Nishitha");
		payment.setCardNumber("9928282558525");
		payment.setCvv("143");
		payment.setExpirationMonth("");
		payment.clickPayment();
	}

	@Then("^displays 'Please fill expiration month'$")
	public void displays_Please_fill_expiration_month() throws Throwable {
		String expectedMessage = "Please fill expiration month";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid expiration year$")
	public void user_enters_invalid_expiration_year() throws Throwable {
		payment.setName("Nishitha");
		payment.setCardNumber("9928282558525");
		payment.setCvv("143");
		payment.setExpirationMonth("08");
		payment.setExpiartionYear("");
		payment.clickPayment();
	}

	@Then("^displays 'Please fill expiration year'$")
	public void displays_Please_fill_expiration_year() throws Throwable {
		String expectedMessage = "Please fill the expiration year";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters valid  payment details$")
	public void user_enters_valid_payment_details() throws Throwable {
		payment.setName("Nishitha");
		payment.setCardNumber("9928282558525");
		payment.setCvv("143");
		payment.setExpirationMonth("10");
		payment.setExpiartionYear("23");
		payment.clickPayment();
	}

	@Then("^displays 'Pan Card Registration Done successfully !!!'$")
	public void displays_Pan_Card_Registration_Done_successfully() throws Throwable {
		String expectedMessage="Pan Card Registration Done successfully !!!";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		//driver.close();
	}

}
