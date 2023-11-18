@app
Feature: TEAM2-127 Customer Can Increase Quantity of Product

  Background: open app
    Given open app

  @app
  Scenario: login
    Given MAIN buttons initializing

    And Tap on Electronics
    And Tap on Camera&Photo
    And Tap on any product
    And Tap Add To Cart button
    And Tap Shopping Cart button

    And Tap [+] button to increase quantity up to 4
    And Tap [-] button to decrease quantity to 1
    And Tap delete button
    Then Tap [continue shopping]