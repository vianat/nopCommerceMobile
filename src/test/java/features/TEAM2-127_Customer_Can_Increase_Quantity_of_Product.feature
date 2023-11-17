@app
Feature: TEAM2-127 Customer Can Increase Quantity of Product

  Background: open app
    Given open app
    And wait 6000

  @app
  Scenario: login
    Given MAIN buttons initializing

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

    And Tap [+] button to increase quantity up to 4
    And wait 1000
    And Tap [-] button to decrease quantity to 1
    And wait 1000
    And Tap delete button
    And wait 1000
    Then Tap [continue shopping]