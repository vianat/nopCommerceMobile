@app
Feature: TEAM2-30 Registered Customer Can Place Order.

  Background: open app
    Given open app
    And wait 6000

  @app
  Scenario: login
    Given MAIN buttons initializing
    And Click [user] btn
    And wait 1000
    And Click [login] btn
    And wait 1000
    And Enter email "team-sun@noreply.portnov.com" and password "ow!<lSy~2H87"
    And Click [login] btn
    And wait 1000
    Then Make sure you see text: "FEATURED PRODUCTS" on main page


    And Tap on Electronics
    And wait 1000
    And Tap on Camera&Photo
    And wait 1000
    And Tap on any product
    And wait 1000
    And Tap Add To Cart button
    And wait 1000
    And Tap Shopping Cart button
    And wait 1000
    And Tap delete button
    And wait 1000

    And Tap USER button
    And wait 1000
    And Click [log out] btn
    And wait 1000
    And Click [CONTINUE WITHOUT LOGIN] btn
    And wait 1000
    Then Make sure you see text: "FEATURED PRODUCTS" on main page