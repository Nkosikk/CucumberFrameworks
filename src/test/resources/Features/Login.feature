Feature: Login

  Scenario Outline: Verify login success
    Given Iam in login page
    And I enter username <username>
    And I enter Password <password>
    When I click login button
    Then landing page is displayed
    Examples:
      | username | password |
      | test     | test     |