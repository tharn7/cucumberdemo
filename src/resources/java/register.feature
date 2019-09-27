Feature: Register User
Scenario: User Registration

Given user is in the registration page
When user enter the username "tharoon1"
And user enter the first name "Tharoon"
And user enters the last name "Kumar"
And user enters the Password "abcd1234"
And user enters the password to confirm "abcd1234"
And user selects the gender"Male"
And user enters the E-Mail"abcd@yjan.com"
And user enters the Mobile Number"7987854654"
And user enters the Date of Birth"12/16/1997"
And user enters the Address"rytrhtgfvgjhgjhg"
And user selects the the Security Question "What is your favour color?"
And user enters the Answer to the security Question "Black" 
Then The user is navigated to the login page