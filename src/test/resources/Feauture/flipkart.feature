

Feature: To validate the functionality of flipkart to add a product to cart

@smoke
Scenario: To launch flipkart

Given User should launch flipkart
When close the popup
And user should search a product using keyword 
|iphone|
And user should add some filters and click a product
Then user should navigate to product detail page
Then user should Add a product to cart

  
