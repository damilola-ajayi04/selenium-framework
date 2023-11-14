@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<Confirmpassword>"
    And I click on create an account
    Then My account page is displayed


    Examples:
      | Firstname | Lastname | Email               | Password    | Confirmpassword |
      | Davis     | Olly     | daveolly3@email.com | Testing001@ | Testing001@     |


  @AccountLogin
  Scenario Outline: Registered customer to login with their email and password
    Given I am on sign in page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    Then My account welcome page should be displayed

    Examples:
      | Email              | Password    |
      | daveolly3@email.com | Testing001@ |


 @DuplicateAccount
  Scenario Outline: Duplicate account not allowed
   Given I am on create account page
   When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<Confirmpassword>"
   And I click on create an account
   Then Account already exist should displayed




    Examples:
      | Firstname | Lastname | Email               | Password  | Confirmpassword |
      | David     | Holy     | daveolly3@email.com | Tester01@ | Tester01@       |



 @UnregisteredAccount
  Scenario Outline: Unregistered customer should see an error
   Given I am on sign in page
   When I enter "<Email>" "<Password>"
   And I click on sign in
   Then Unregistered account should displayed



    Examples:
      | Email              | Password    |
      | daveolly@gmail.com | Testing001@ |