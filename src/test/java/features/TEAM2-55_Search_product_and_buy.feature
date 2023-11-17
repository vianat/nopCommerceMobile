@app
Feature: TEAM2-2_User_can_search_product_and_buy

  Background: open app
    Given open app
    And wait 5000

  @app
  Scenario: login
    Given MAIN buttons initializing
    And Tap in search field
    And wait 500
    And Enter "HTC one" in search field
    And wait 500
    And Tap [search icon]
    And wait 500
    And Tap on first product
    And wait 1500

    And Tap Add To Cart button
    And wait 1000
    And Tap Shopping Cart button
    And wait 1000
    And Tap delete button
    And wait 1000

    And Tap [continue shopping]
    And wait 1000
    Then Make sure you see text: "FEATURED PRODUCTS" on main page