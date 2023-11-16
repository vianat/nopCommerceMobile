@app
Feature: TEAM2-77_Verify_that_a_registered_user_can_login_with_valid_credentials

  Background: open app
    Given open app
    And wait 2000

  @google
  Scenario: login
    Given Click [user] btn
    And wait 1000
    Given Click [login] btn
    And wait 1000
    And Enter email "team-sun@noreply.portnov.com"
#    And Enter password "ow!<lSy~2H87"
#    And Click [Log in] button
    And wait 2000
#    Then Make sure you see Log out button and text: "Welcome to our store"