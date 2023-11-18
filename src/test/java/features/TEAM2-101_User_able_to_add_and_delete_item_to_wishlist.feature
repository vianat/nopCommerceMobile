@app
Feature: TEAM2-127 Customer Can Increase Quantity of Product

  Background: open app
    Given open app

  @app
  Scenario: login
    Given MAIN buttons initializing

    And Tap on [DIGITAL DOWNLOADS]
    And Tap any product

    And Tap add product to wishlist
    And Tap USER button

    And Tap [WISHLIST] button
    And Tap trash icon on product

    And Verify massage "The wishlist is empty!" is displayed
    Then Tap HOME button