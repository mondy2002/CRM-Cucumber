Feature:test calender functionality
  Scenario: to test new event functionality
  Given user logged in successfully
  When user hover the calender button
  And chooses New event  
  Then user should navigate to New event page
   
  
    Scenario: to test view today functionality
  Given user logged in successfully
  When user hover the calender button
  And chooses view today 
  Then user should navigate to view today page
  
    Scenario: to test week view functionality
  Given user logged in successfully
  When user hover the calender button
  And chooses week view  
  Then user should navigate to week view page
  
    Scenario: to test month view functionality
  Given user logged in successfully
  When user hover the calender button
  And chooses month view  
  Then user should navigate to month view page
  
