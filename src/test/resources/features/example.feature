Feature: Login

  Scenario Outline : Successful login with valid credentials
    Given User is on login page
    When User enters username "<username>" and password "<password>"
    Then User should be logged in

    Examples:
      | username | password  |
      | testuser | password1 |
      | user2    | password2 |
      | user3    | password3 |