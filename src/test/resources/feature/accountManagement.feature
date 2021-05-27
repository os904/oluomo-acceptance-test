@accountManagement
Feature: Account Management

  @createAccount
  Scenario Outline: create an account with a valid email
    Given user is on create an account page
    When  user enter "<FirstName>"and"<LastName>"and"<Email>"and"<Password>"and"<ConfirmPassword>"
    And   user clicks on create an account
    Then  My account page is displayed


    Examples:
      | FirstName | LastName | Email         | Password   | ConfirmPassword |
      | Adeife    | kee      | leg@yahoo.com | vee@465@kk | vee@465@kk      |
     # | test      | Gee      | ret896@gmail.com | det@t54r  | det@t54r        |



  @login
  Scenario Outline: Account Login- Registered Customer username and password
    Given user is on account login page
    When user enter "<UserName>" and "<Password>"
    And  User clicks on login button
    Then  login  is successfully
    When user is

    Examples:
      | UserName      | Password   |
      | leg@yahoo.com | vee@465@kk |

  @updateCustomerDetails
  Scenario Outline: Update Customer Details- Update Address, Contact Number
    Given user is on update customer details page
    When user clicks on sign in link
    And user enter "<UserName>" and "<Password>"
    And user click on login button
    Then update customer details page is displayed

    Examples:
      | UserName        | Password    |
      | sweet@gmail.com | Bitter@ugly |

