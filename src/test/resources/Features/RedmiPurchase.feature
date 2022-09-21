
  #redmi clk
  #clk frst product
  #buynow clickable
  # mobile name (assert)
  # price equal
  # available present
 
  #radio buton chekc
  ##click second raadio
  #invalid pin with msg
  #addcart
  #Delivery date
  #price details
    
Feature: Validating Redmi Mobile
  

  @tag1
  Scenario: Redmi Mobile  Purchase
    Given Flipkart Login
    When Redmi Mobile Search "Redmi"
    And Taking product list
    And Clicking Product
    And Windows Handling
    And Screenshot1
    And Validation
    And Presentation
    And Radio button
    And Delivery Details
    And Price Details
    Then quit
    
