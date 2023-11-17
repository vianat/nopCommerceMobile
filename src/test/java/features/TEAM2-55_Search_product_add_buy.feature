@app
Feature: TEAM2-2_Registered_user_able_to_add_item_to_cart

  Background: open app
    Given open app
    And wait 2000

  @app
  Scenario: login
    Given Click in search field
    And wait 300
    And Enter "HTC one" in search field
    And wait 300
    Given Click [search icon]
    And wait 300
    And Click on first product
    And wait 1500
    And Scroll down
    And Click [ADD TO CART]
    And wait 2000
    And Click [CART] button
    And wait 1000


#    Given Click [user] btn
#    And wait 300
#    And Click [login] btn
#    And wait 300
#    And Enter email "team-sun@noreply.portnov.com" and password "ow!<lSy~2H87"
#    And Click [login] btn
#    And wait 300
#    Then Make sure you see text: "FEATURED PRODUCTS" on main page
#    And Click [user] btn
#    And wait 300
#    And Click [log out] btn
#    And wait 500
#    And Click [CONTINUE WITHOUT LOGIN] btn
#    And wait 1000
#    Then Make sure you see text: "FEATURED PRODUCTS" on main page