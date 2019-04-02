Feature: verify Login 

Background: 
	Given Read test data from "testData.xlsx" from "sheet1" for "user0". 
	
Scenario Outline: verify Login 
	Given User is on landing page. 
	When User enter username and password. 
	And Click on login button. 
	Then Verify user should be able to login in. 
	
	Examples: 
		| user  |
		| user0 |
