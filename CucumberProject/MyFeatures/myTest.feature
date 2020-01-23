Feature: Test Smoke Sceanrious
@Test
@smoke
Scenario Outline: Test Login fuctionailty

Given  Username as "<userName>" and Password as "<passWord>"
When Create Project in Dev
Then Create Sprint in Dev
#And Create "<CreateTask>" in Dev



Examples:
|userName||passWord||CreateTask|
|ram6@yahoo.com||11111111||NewWindow|





