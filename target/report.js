$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/DD/workspace/Flipkart/src/test/resources/Features/RedmiPurchase.feature");
formatter.feature({
  "name": "Validating Redmi Mobile",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Redmi Mobile  Purchase",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Flipkart Login",
  "keyword": "Given "
});
formatter.match({
  "location": "RedmiPurchase.flipkart_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Redmi Mobile Search \"Redmi\"",
  "keyword": "When "
});
formatter.match({
  "location": "RedmiPurchase.redmi_Mobile_Search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Taking product list",
  "keyword": "And "
});
formatter.match({
  "location": "RedmiPurchase.taking_product_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicking Product",
  "keyword": "And "
});
formatter.match({
  "location": "RedmiPurchase.clicking_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Windows Handling",
  "keyword": "And "
});
formatter.match({
  "location": "RedmiPurchase.windows_Handling()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Screenshot1",
  "keyword": "And "
});
formatter.match({
  "location": "RedmiPurchase.screenshot(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validation",
  "keyword": "And "
});
formatter.match({
  "location": "RedmiPurchase.validation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Presentation",
  "keyword": "And "
});
formatter.match({
  "location": "RedmiPurchase.Presentation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Radio button",
  "keyword": "And "
});
formatter.match({
  "location": "RedmiPurchase.radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delivery Details",
  "keyword": "And "
});
formatter.match({
  "location": "RedmiPurchase.delivery_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Price Details",
  "keyword": "And "
});
formatter.match({
  "location": "RedmiPurchase.Price_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quit",
  "keyword": "Then "
});
formatter.match({
  "location": "RedmiPurchase.quit()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});