$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFeatures/myTest.feature");
formatter.feature({
  "name": "Test Smoke Sceanrious",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test Login fuctionailty",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Username as \"\u003cuserName\u003e\" and Password as \"\u003cpassWord\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Create Project in Dev",
  "keyword": "When "
});
formatter.step({
  "name": "Create Sprint in Dev",
  "keyword": "Then "
});
formatter.step({
  "name": "Create \"\u003cCreateTask\u003e\" in Dev",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "",
        "passWord",
        "",
        "CreateTask"
      ]
    },
    {
      "cells": [
        "ram6@yahoo.com",
        "",
        "11111111",
        "",
        "NewWindow"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test Login fuctionailty",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Username as \"ram6@yahoo.com\" and Password as \"11111111\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTool.launchBrowser(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create Project in Dev",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTool.createProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create Sprint in Dev",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTool.createSprint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create \"NewWindow\" in Dev",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTool.taskCreate(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression (//div[@class\u003d\u0027progress-block\u0027]v )[8] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027(//div[@class\u003d\u0027progress-block\u0027]v )[8]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d79.0.3945.88)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027EINZTON\u0027, ip: \u0027192.168.1.26\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Dev\\AppData\\Local\\...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 79.0.3945.88, webStorageEnabled: true}\nSession ID: d9fdbb821e1ca0b98686962c55728c13\n*** Element info: {Using\u003dxpath, value\u003d(//div[@class\u003d\u0027progress-block\u0027]v )[8]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinition.LoginTool.taskCreate(LoginTool.java:59)\r\n\tat ✽.Create \"NewWindow\" in Dev(MyFeatures/myTest.feature:9)\r\n",
  "status": "failed"
});
});