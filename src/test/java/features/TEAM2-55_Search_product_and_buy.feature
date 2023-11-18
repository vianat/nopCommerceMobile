@app
Feature: TEAM2-2_User_can_search_product_and_buy

  Background: open app
    Given open app

  @app
  Scenario: login
    Given MAIN buttons initializing
    And Tap in search field
    And Enter "HTC one" in search field
    And Tap [search icon]
    And Tap on first product

    And Tap Add To Cart button
    And Tap Shopping Cart button
    And Tap delete button

    And Tap [continue shopping]
    Then Make sure you see text: "FEATURED PRODUCTS" on main page