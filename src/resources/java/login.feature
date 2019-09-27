Feature: User login
  Scenario Outline: Login
    Given User is in the login page
    When user enter the "<username>"
    And user enters the "<password>"
    Then the user is logged in

    Examples: 
      |username|password|
      |lalitha|password123|
     
     
