Feature: UserInformation 

Scenario: Invalid Applicant 

	Given User is on 'UserInformation' Page 
	When user enetrs invalid ApplicantName 
	Then display 'Please fill the Applicant Name' 
	
Scenario: Invalid FirstName 

	Given User is on 'UserInformation' Page 
	When user enetrs invalid firstName 
	Then display 'Please fill the First Name' 
	
	
Scenario: Invalid LastName 
	Given User is on 'UserInformation' Page 
	When user enetrs invalid lastName 
	Then display 'Please fill the Last Name' 
	
Scenario: Invalid FatherName 

	Given User is on 'UserInformation' Page 
	When user enetrs invalid FatherName 
	Then display 'Please fill the Father Name' 
	
Scenario: Invalid DateOfbirth 

	Given User is on 'UserInformation' Page 
	When user enetrs invalid DateOfbirth 
	Then display 'Please fill the DateOfbirth' 
	When user enter invalid pattern of dateofbirth 
	
Scenario: Invalid Gender 

	Given User is on 'UserInformation' Page 
	When user enetrs invalid Gender 
	Then display 'Please fill the Gender' 
	
	
	
	
Scenario: Invalid Mobile Number 

	Given User is on 'UserInformation' Page 
	When user enetrs invalid Mobile Number 
	Then display 'Please fill valid mobile no.' 
	When user enter invalid pattern of mobileNo 
	
Scenario: Invalid mailId 

	Given User is on 'UserInformation' Page 
	When user enetrs invalid mailId 
	Then display 'Please fill the mailId' 
	When user enters invalid pattern mailId 
	
Scenario: Invalid LandLine 

	Given User is on 'UserInformation' Page 
	When user enetrs invalid LandLine 
	Then display 'Please fill valid LandLine no.' 
	
	
Scenario: Invalid Communication 

	Given User is on 'UserInformation' Page 
	When user enetrs invalid Communication 
	Then display 'Please fill the Communication' 
	
Scenario: Invalid Reset

	Given User is on 'UserInformation' Page 
	When user enetrs invalid Reset 
	Then display 'Please fill the Reset' 
	
	
Scenario: Valid Details 

	Given User is on 'UserInformation' Page 
	When user enters valid details 
	Then display 'Personal details are validated' 
	
	
Scenario: Page loads 

	Given User is on 'UserInformation' Page 
	When user enetrs url 
	Then page should be loaded 