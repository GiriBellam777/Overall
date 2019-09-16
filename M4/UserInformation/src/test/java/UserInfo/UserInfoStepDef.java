package UserInfo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import BeanPages.UserInfromationBeanFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserInfoStepDef {

	private WebDriver driver;
	private UserInfromationBeanFactory userinfo;

	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\sthunga\\Desktop\\selenium jars\\chromedriver.exe");
	}

	@Given("^User is on 'UserInformation' Page$")
	public void user_is_on_UserInformation_Page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("D:/Users/sthunga/Desktop/M$QUESTIon/UserInformation.html");
		userinfo = new UserInfromationBeanFactory();
		PageFactory.initElements(driver, userinfo);

	}

	@When("^user enetrs url$")
	public void user_enetrs_url() throws Throwable {

	}

	@Then("^page should be loaded$")
	public void page_should_be_loaded() throws Throwable {
		String expectedPageTitle = "PAN CARD: User Information";
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
	}

	@When("^user enetrs invalid ApplicantName$")
	public void user_enetrs_invalid_ApplicantName() throws Throwable {
		userinfo.setApplicantName("");
		userinfo.clickNextButton();
		

	}

	@Then("^display 'Please fill the Applicant Name'$")
	public void display_Please_fill_the_Applicant_Name() throws Throwable {
		String expectedMessage = "Please fill the Applicant Name ";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enetrs invalid firstName$")
	public void user_enetrs_invalid_firstName() throws Throwable {
		userinfo.setApplicantName("Nishitha Juvvadi");
		userinfo.setFirstName("");
		userinfo.clickNextButton();
		
	}

	@Then("^display 'Please fill the First Name'$")
	public void display_Please_fill_the_First_Name() throws Throwable {
		String expectedMessage = "Please fill the First Name ";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enetrs invalid lastName$")
	public void user_enetrs_invalid_lastName() throws Throwable {
		userinfo.setApplicantName("Nishitha Juvvadi");
		userinfo.setFirstName("Nishitha");
		userinfo.setLastName("");
		userinfo.clickNextButton();
		
	}

	@Then("^display 'Please fill the Last Name'$")
	public void display_Please_fill_the_Last_Name() throws Throwable {
		String expectedMessage = "Please fill the Last Name ";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enetrs invalid FatherName$")
	public void user_enetrs_invalid_FatherName() throws Throwable {
		userinfo.setApplicantName("Nishitha Juvvadi");
		userinfo.setFirstName("Nishitha");
		userinfo.setLastName("Juvvadi");
		userinfo.setFatherName("");
		userinfo.clickNextButton();
		
	}

	@Then("^display 'Please fill the Father Name'$")
	public void display_Please_fill_the_Father_Name() throws Throwable {

		String expectedMessage="Please fill the Father Name ";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enetrs invalid DateOfbirth$")
	public void user_enetrs_invalid_DateOfbirth() throws Throwable {
		userinfo.setApplicantName("Nishitha Juvvadi");
		userinfo.setFirstName("Nishitha");
		userinfo.setLastName("Juvvadi");
		userinfo.setFatherName("Nithesh");
		userinfo.setDateOfBirth("");
		userinfo.clickNextButton();
		
	}

//	@SuppressWarnings("unused")
//	private void alert(String string) {
//		alert("Please Enter valid date(dd-MM-yyyy)");
//		
//	}

	@Then("^display 'Please fill the DateOfbirth'$")
	public void display_Please_fill_the_DateOfbirth() throws Throwable {
		String expectedMessage="Please fill the DOB";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();

	}
	@When("^user enter invalid pattern of dateofbirth$")
	public void user_enter_invalid_pattern_of_dateofbirth() throws Throwable {
		String expectedMessage="Please Enter valid date(dd-MM-yyyy)";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();

	}
	
	@When("^user enetrs invalid Gender$")
	public void user_enetrs_invalid_Gender() throws Throwable {
		userinfo.setApplicantName("Nishitha Juvvadi");
		userinfo.setFirstName("Nishitha");
		userinfo.setLastName("Juvvadi");
		userinfo.setFatherName("Nithesh");
		userinfo.setDateOfBirth("01-02-1998");
		userinfo.clickGender();
		userinfo.clickNextButton();
		
	}
	
	@Then("^display 'Please fill the Gender'$")
	public void display_Please_fill_the_Gender() throws Throwable {
		String expectedMessage="Please fill the DOB";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();

	}
	

	@When("^user enetrs invalid Mobile Number$")
	public void user_enetrs_invalid_Mobile_Number() throws Throwable {
		userinfo.setApplicantName("Nishitha Juvvadi");
		userinfo.setFirstName("Nishitha");
		userinfo.setLastName("Juvvadi");
		userinfo.setFatherName("Nithesh");
		userinfo.setDateOfBirth("01-02-1998");
		userinfo.clickGender();
		userinfo.setMobileNo("");
		userinfo.clickNextButton();
		
	}

	@Then("^display 'Please fill valid mobile no\\.'$")
	public void display_Please_fill_valid_mobile_no() throws Throwable {
		String expectedMessage="Please fill the Contact No.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
		driver.close();
	}
	
//	@When("^user enter invalid pattern of mobileNo'$")
//	public void user_enter_invalid_pattern_of_mobileNo() throws Throwable {
//		String expectedMessage="Please enter valid mobile no";
//		String actualMessage=driver.switchTo().alert().getText();
//		Assert.assertEquals(expectedMessage, actualMessage);
//		driver.switchTo().alert().dismiss();
//		driver.close();
//	}

	@When("^user enetrs invalid mailId$")
	public void user_enetrs_invalid_mailId() throws Throwable {
		userinfo.setApplicantName("Nishitha Juvvadi");
		userinfo.setFirstName("Nishitha");
		userinfo.setLastName("Juvvadi");
		userinfo.setFatherName("Nithesh");
		userinfo.setDateOfBirth("01-02-1998");
		userinfo.clickGender();
		userinfo.setMobileNo("9177506434");
		userinfo.setMailId("");
		userinfo.clickNextButton();
		
	}

	@Then("^display 'Please fill the mailId'$")
	public void display_Please_fill_the_mailId() throws Throwable {
		String expectedMessage="Please fill the Email id ";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
		driver.close();
	}
	
	@When("^user enters invalid pattern mailId$")
	public void user_enters_invalid_pattern_mailId() throws Throwable {
		String expectedMessage="Please enter valid Email id";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
		driver.close();
	}

	@When("^user enetrs invalid LandLine$")
	public void user_enetrs_invalid_LandLine() throws Throwable {
		userinfo.setApplicantName("Nishitha Juvvadi");
		userinfo.setFirstName("Nishitha");
		userinfo.setLastName("Juvvadi");
		userinfo.setFatherName("Nithesh");
		userinfo.setDateOfBirth("01-02-1998");
		userinfo.clickGender();
		userinfo.setMobileNo("9177506434");
		userinfo.setMailId("thunga@gmail.com");
		userinfo.setLandLine("");
		userinfo.clickNextButton();
	
	}

	@Then("^display 'Please fill valid LandLine no\\.'$")
	public void display_Please_fill_valid_LandLine_no() throws Throwable {
		String expectedMessage="please fill the landline no";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
		driver.close();
	}

	@When("^user enetrs invalid Communication$")
	public void user_enetrs_invalid_Communication() throws Throwable {
		userinfo.setApplicantName("Nishitha Juvvadi");
		userinfo.setFirstName("Nishitha");
		userinfo.setLastName("Juvvadi");
		userinfo.setFatherName("Nithesh");
		userinfo.setDateOfBirth("01-02-1998");
		userinfo.clickGender();
		userinfo.setMobileNo("9177506434");
		userinfo.setMailId("thunga@gmail.com");
		userinfo.setLandLine("6493982");
		userinfo.clickCommunication();
		userinfo.clickNextButton();
		
	}

	@Then("^display 'Please fill the Communication'$")
	public void display_Please_fill_the_Communication() throws Throwable {
		String expectedMessage="Please select the Type of Communication";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
		driver.close();
	}
	
	@When("^user enetrs invalid Reset$")
	public void user_enetrs_invalid_Reset() throws Throwable {
		userinfo.clickResetButton();
	}
	
	@Then("^display 'Please fill the Reset'$")
	public void display_Please_fill_the_Reset() throws Throwable {
		String expectedMessage="please enter the Addresss";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
		driver.close();
	}
	
	

	@When("^user enters valid details$")
	public void user_enters_valid_details() throws Throwable {
		userinfo.setApplicantName("Nishitha Juvvadi");
		userinfo.setFirstName("Nishitha");
		userinfo.setLastName("Juvvadi");
		userinfo.setFatherName("Nithesh");
		userinfo.setDateOfBirth("01-02-1998");
		userinfo.clickGender();
		userinfo.setMobileNo("9177506434");
		userinfo.setMailId("thunga@gmail.com");
		userinfo.setLandLine("6493982");
		userinfo.clickCommunication();
		userinfo.clickNextButton();
		
	}

	@Then("^display 'Personal details are validated'$")
	public void display_Personal_details_are_validated() throws Throwable {
		String expectedMessage="Personal details are validated.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.get("D:/Users/sthunga/Desktop/M$QUESTIon/PaymentDetails.html");
		//driver.close();

	}

}
