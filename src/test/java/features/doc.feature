	Feature: AutomateLeaftaps Application  //This page name is feature file
@Smoke
	Scenario: TC001_Login and Logout
	
	Given launch chromebrowser and load url
	And enter username as demosalesmanager
	And enter password as crmsfa
	When click the login button
	Then its navigated Homepage
	And click the logout button
	And close browser
	
	#Examples:
	#|username|password|
	
	
@Smoke
Scenario: TC002_Login and Logout for failer
	
	Given launch chromebrowser and load url
	And enter username as demo
	And enter password as crmsfa
	When click the login button
	Then its navigated same page
	But verify error msg
	And close browser

@wip
Scenario: TC003_CreateLead
	
	Given launch chromebrowser and load url
	And enter username as demosalesmanager
	And enter password as crmsfa
	And click the login button
	And click CRMSFA
	And click leads link
	When click createLead
	And enter the companyName as ABC
	And enter the firstName as Heam 
	And enter the lastName as Mali
	And choose source as website
	And click the create lead button
	Then its navigated ViewLeadPage
	And verify the firstName
	And close browser
	
	@wip
	Scenario: TC004_EditLead
	
	Given launch chromebrowser and load url
	And enter username as demosalesmanager
	And enter password as crmsfa
	And click the login button
	And click CRMSFA
	And click leads link
	When click find Leads
	And enter firstName
  And click Find Leads button
  And click first resulting lead
	Then  navigated ViewLeadPage
	And verify title of the page
	And click on Edit
	Then navigated Edit Lead page
	And change the company name
	And click update
	And conferm changed name appears
	And close browser
	
	@WIP
	Scenario: TC005_DeleteLead
	
	Given launch chromebrowser and load url
	And enter username as demosalesmanager
	And enter password as crmsfa
	And click the login button
	And click CRMSFA
	And click leads link
	When click find Leads
	And click on phone 
	And enter phone number
	 And click Find Leads button
	 And capture lead ID of first resulting lead 
	 And click first resulting lead
	 And click Delete
	 Then navigated MyLeadsPage
	 And click find Leads
	 And enter captured lead ID
	And click Find Leads button
	And verify error message 
	And close browser
	
	
	
	
	