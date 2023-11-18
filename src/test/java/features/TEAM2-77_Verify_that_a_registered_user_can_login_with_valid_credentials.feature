@app
Feature: TEAM2-77_Verify_that_a_registered_user_can_login_with_valid_credentials

  Background: open app
    Given open app

  @app
  Scenario: login
    Given Click [user] btn
    And Click [login] btn
    And Enter email "team-sun@noreply.portnov.com" and password "ow!<lSy~2H87"
    And Click [login] btn
    Then Make sure you see text: "FEATURED PRODUCTS" on main page
    And Click [user] btn
    And Click [log out] btn
    And Click [CONTINUE WITHOUT LOGIN] btn
    Then Make sure you see text: "FEATURED PRODUCTS" on main page