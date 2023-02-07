$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feauture/flipkart.feature");
formatter.feature({
  "name": "To validate the functionality of flipkart to add a product to cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To launch flipkart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User should launch flipkart",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefnition.user_should_launch_flipkart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the popup",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefnition.close_the_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should search a product using keyword",
  "rows": [
    {
      "cells": [
        "iphone"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefnition.user_should_search_a_product_using_keyword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should add some filters and click a product",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefnition.user_should_add_some_filters_and_click_a_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigate to product detail page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefnition.userShouldNavigateToproductDetailPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should Add a product to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefnition.user_should_Add_a_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
});