$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Dev/git/CucumberFrameWork/CucumberProject/MyFeatures/myTest.feature");
formatter.feature({
  "name": "Test Smoke Sceanrious",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test Login fuctionailty",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Given Launch browsers",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginandHomepPage.launchBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create Project in Devs",
  "keyword": "When "
});
formatter.match({
  "location": "LoginandHomepPage.addProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create Sprint in Devs",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginandHomepPage.addsprint()"
});
formatter.result({
  "status": "passed"
});
});