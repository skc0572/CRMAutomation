Feature: feature to place order from CRM.

	Scenario: End to End scenario to place order on CRM
	
	Given user logins to crm
	When user clicks on sales option
	Then click on Enquiries
	And click on New Enquiry
	And user fills all the mandatory fields
	And clicks on sales option 
	And clicks on quote 
	And select the respective quote 
	And edit quote, save
	