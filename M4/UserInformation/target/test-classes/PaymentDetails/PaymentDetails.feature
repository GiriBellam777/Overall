Feature: Payment Details


Scenario: Valid Title

Given user is on Payment Details page
When user enters loads the page
Then valid page should open


Scenario: Invalid cardHolder name

Given user is on Payment Details page
When user enters invalid name
Then displays 'Please fill name'


Scenario: Invalid Debit Card Number

Given user is on Payment Details page
When user enters invalid Debit Card Number
Then displays 'Please fill Debit Card Number'

Scenario: Invalid CVV

Given user is on Payment Details page
When user enters invalid CVV
Then displays 'Please fill CVV'

Scenario: Invalid expiration month

Given user is on Payment Details page
When user enters invalid expiration month
Then displays 'Please fill expiration month'
  

Scenario: Invalid expiration year

Given user is on Payment Details page
When user enters invalid expiration year
Then displays 'Please fill expiration year'
  

Scenario: Valid details

Given user is on Payment Details page
When user enters valid  payment details
Then displays 'Pan Card Registration Done successfully !!!' 