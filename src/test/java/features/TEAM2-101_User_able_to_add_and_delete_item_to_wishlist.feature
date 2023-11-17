@app
Feature: TEAM2-127 Customer Can Increase Quantity of Product

  Background: open app
    Given open app
    And wait 6000

  @app
  Scenario: login
    Given MAIN buttons initializing

    And Tap on [DIGITAL DOWNLOADS]
    And wait 1000
    And Tap any product
    And wait 1000

    And Tap add product to wishlist
    And wait 1500
    And Tap USER button
    And wait 1500

    And Tap [WISHLIST] button
    And wait 1000
    And Tap [trash] icon on product

    And wait 1000

#    Then Verify massage "The wishlist is empty!" is displayed

#    And Tap HOME button