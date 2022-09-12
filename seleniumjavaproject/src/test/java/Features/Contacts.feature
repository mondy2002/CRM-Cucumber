Feature: Contact page feature
  

	Scenario: make sure that the email text field is visible
	  Given user come to the web site and go to login page
	  When user fill in email as "mondy1" and password as "123456" and press login
	  Then user should navigate to home page
	  And Clicks on context
	  Then email text field should be visible
	  
	     
	Scenario: add new contact
	  Given user come to the web site and go to login page
	  When user fill in email as "mondy1" and password as "123456" and press login
	  Then user should navigate to home page
	  And Clicks on context
	  And Clicks on new contact
	  And Fill the first name and password 
	  Then A new contact should be added
	  
	   
	  

