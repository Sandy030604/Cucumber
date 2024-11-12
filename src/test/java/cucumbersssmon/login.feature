@tag
Feature: Login to opencart application


  @tag1
  Scenario: login successful
    Given launch the browser
    And Navigate to the URL
    When Enter the valid username and password
    And Click on login button
    Then login should be successful

  @tag2
  Scenario: login unsuccessful
    Given launch the browser
    And Navigate to the URL
    When Enter the invalid username and password
    And Click on login button
    Then login should be unsuccessful


