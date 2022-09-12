Feature:test the New form functionality
     
    @Sanity
  Scenario: to create new form with valid credentials
  Given user logged in successfully
  When user press login clicks on forms and then clicks on new form 
  And fill in title as "my form", pages as "4" , report email as "test@gmail.com" ,describtion as "this is the test"and welcome as "hello"  
  Then the report is created suuccessfully and details are shown
  
 @Sanity
Scenario: to create new form with invalid credentials
  Given user logged in successfully
  When user press login clicks on forms and then clicks on new form 
  And fill in title as "<title>", pages as "<pages>" , report email as "<email>" ,describtion as "<describtion>"and welcome as "<welcome>"  
  Then error message appears
    Examples:
  |    title      |   pages  |    email       | describtion|  welcome    |
  |    myform     |   1      |  test12        |  this it   |  hello      |
  |    myform     |   0      |  test@gmail.com|   this it  |  hello      |
  |    myform     |   500    |  test@gmail.com|   this it  |  hello      |
  

