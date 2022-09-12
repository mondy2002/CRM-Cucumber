Feature:test the login functionality

  Scenario: to login with valid email and password
  Given user come to the web site and go to login page
  When user fill in email as "mondy1" and password as "123456" and press login
  Then user should navigate to home page
  Scenario Outline: log in with invalid credentials
  Given user come to the web site and go to login page
  When user fill in email as "<username>" and password as "<password>" and press login
  Then error message should appear
  Examples:
  |    username   |   password   |
  |    mondy1     |   wrong      |
  |    mondy      |   123456     |
  |    mondy      |   wrong      |
  
   