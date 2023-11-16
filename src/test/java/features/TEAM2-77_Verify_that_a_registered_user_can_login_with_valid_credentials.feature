@app
Feature: TEAM2-77_Verify_that_a_registered_user_can_login_with_valid_credentials

  Background: open app
    Given open app
    And wait 6000

  @google
  Scenario: login
    Given Click [user] btn
    And wait 1000
    And Click [login] btn
    And wait 1000
    And Enter email "team-sun@noreply.portnov.com" and password "ow!<lSy~2H87"
    And Click [login] btn
    And wait 1000
    Then Make sure you see text: "FEATURED PRODUCTS" on main page
    And Click [user] btn
    And wait 1000
    And Click [log out] btn
    And wait 1000
    And Click [CONTINUE WITHOUT LOGIN] btn
    And wait 1000
    Then Make sure you see text: "FEATURED PRODUCTS" on main page