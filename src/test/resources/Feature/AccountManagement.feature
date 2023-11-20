@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<Confirmpassword>"
    And I click on create an account
    Then My account page is displayed


    Examples:
      | Firstname | Lastname | Email                | Password    | Confirmpassword |
      | Davis     | Olly     | daveolly50@email.com | Testing002@ | Testing002@     |


  @AccountLogin
  Scenario Outline: Registered customer to login with their email and password
    Given I am on sign in page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    Then My account welcome page should be displayed

    Examples:
      | Email                | Password    |
      | daveolly50@email.com | Testing002@ |


  @DuplicateAccount
  Scenario Outline: Duplicate account not allowed
    Given I am on create account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<Confirmpassword>"
    And I click on create an account
    Then Account already exist should displayed




    Examples:
      | Firstname | Lastname | Email                | Password  | Confirmpassword |
      | David     | Holy     | daveolly50@email.com | Tester01@ | Tester01@       |


  @UnregisteredAccount
  Scenario Outline: Unregistered customer should see an error
    Given I am on sign in page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    Then Unregistered account should displayed



    Examples:
      | Email              | Password   |
      | daveolly@gmail.com | Testing01@ |


  @UpdatePassword
  Scenario Outline: Update account password
    Given I am on sign in page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    And I click on change password
    And I enter "<CurrentPassword>" "<NewPassword>" "<ConfirmNewPassword>"
    Then My account password should be updated

    Examples:
      | Email                | Password    | CurrentPassword | NewPassword  | ConfirmNewPassword |
      | daveolly50@email.com | Testing002@ | Testing002@     | Testing002@@ | Testing002@@       |


  @UpdateCustomerDetails
  Scenario Outline: Update Address, Contact Telephone Number
    Given I am on sign in page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    And I click Update new addresses and phone number
    And i input "<StreetAddress>" "<City>" "<ZipCode>"
    Then address and Contact Telephone Number is updated


    Examples:
      | Email                | Password    | StreetAddress | City  | ZipCode |
      | daveolly50@email.com | Testing001@ | 1/1 Oslo ave  | Glago | 1aa 1bb |

