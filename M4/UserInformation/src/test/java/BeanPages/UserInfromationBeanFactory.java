package BeanPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserInfromationBeanFactory {

	@FindBy(id = "txtName")
	WebElement ApplicantName;

	@FindBy(id = "txtFirstName")
	WebElement firstName;

	@FindBy(id = "txtLastName")
	WebElement lastName;

	@FindBy(id = "txtFatherName")
	WebElement fatherName;

	@FindBy(id = "txtDOB")
	WebElement dateOfBirth;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[7]/td[2]")
	WebElement gender;

	@FindBy(id = "txtMobileNo")
	WebElement mobileNo;

	@FindBy(id = "txtEmail")
	WebElement mailId;

	@FindBy(id = "txtLndLine")
	WebElement landLine;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[11]/td[2]")
	WebElement communication;
	
	
	@FindBy(id = "txtLndLine")
	WebElement residencyAdd;
	
	@FindBy(id="btnSubmit")
	WebElement SubmitButton;
	
	@FindBy(id="btnReset")
	WebElement ResetButton;
	

	public UserInfromationBeanFactory() {
		
	}

	public String getApplicantName() {
		return this.ApplicantName.getAttribute("value");
	}

	public void setApplicantName(String ApplicantName) {
		this.ApplicantName.sendKeys(ApplicantName);
	}

	public String getFirstName() {
		return this.firstName.getAttribute("value");
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public String getLastName() {
		return this.lastName.getAttribute("value");
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public String getFatherName() {
		return this.fatherName.getAttribute("value");
	}

	public void setFatherName(String fatherName) {
		this.fatherName.sendKeys(fatherName);
	}

	public String getDateOfBirth() {
		return this.dateOfBirth.getAttribute("value");
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth.sendKeys(dateOfBirth);
	}

//	public String getGender() {
//		return this.gender.getAttribute("value");
//	}

	public void clickGender() {
		gender.click();
	}


	public String getMobileNo() {
		return this.mobileNo.getAttribute("value");
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo.sendKeys(mobileNo);
	}
	public String getMailId() {
		return this.mailId.getAttribute("value");
	}


	public void setMailId(String mailId) {
		this.mailId.sendKeys(mailId);
	}
	
	public String getLandLine() {
		return this.landLine.getAttribute("value");
	}
	public void setLandLine(String landLine) {
		this.landLine.sendKeys(landLine);
	}

//	public WebElement getCommunication() {
//		return communication;
//	}

	public void clickCommunication() {
		communication.click();
	}

	public void clickNextButton() {
		SubmitButton.click();
	}
	public String getResidencyAdd() {
		return this.residencyAdd.getAttribute("value");
	}

	public void setResidencyAdd(String residencyAdd) {
		this.residencyAdd.sendKeys(residencyAdd);
	}
	public void clickResetButton() {
		ResetButton.click();
	}

}
