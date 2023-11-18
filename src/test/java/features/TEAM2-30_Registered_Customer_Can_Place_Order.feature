@app
Feature: TEAM2-30 Registered Customer Can Place Order.

  Background: open app
    Given open app

  @app
  Scenario: login
    Given MAIN buttons initializing
    And Click [user] btn
    And Click [login] btn
    And Enter email "team-sun@noreply.portnov.com" and password "ow!<lSy~2H87"
    And Click [login] btn
    Then Make sure you see text: "FEATURED PRODUCTS" on main page

    And Tap on Electronics
    And Tap on Camera&Photo
    And Tap on any product
    And Tap Add To Cart button
    And Tap Shopping Cart button
    And Tap delete button

    And Tap USER button
    And Click [log out] btn
    And Click [CONTINUE WITHOUT LOGIN] btn
    Then Make sure you see text: "FEATURED PRODUCTS" on main page