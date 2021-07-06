InterviewAdidas UI Automation Testing & Instructions
Prepared by:
Kevser Cetin Karagoz

QA Test Automation Engineer

kevsercetink@gmail.com

https://www.linkedin.com/in/kevsercetinkaragoz/

- Build Tool: Maven

- Test Framework: Cucumber BBD (with Junit 4 Assertions)

UI Automation Testing:
https://www.amazon.com/

QA:
Generating test scenarios and automation framework for an End to End test.

System Requirements:
Java 1.8 + SDK
Selenium Webdriver
Maven
Cucumber
Gherkin Language Syntax
Selenium Webdriver
JUnit
Test RUN
https://github.com/celikyus01/AnswerDigital.git
Clone the projects

Reload maven dependencies from POM

Go **src -> test > java > com > amazon > runners > CukesRunner

Tags explanation:
@amazon: runs all the scenarios in the project
@end2end: adding the spesific product to the basket
@subtitle: searched product is seen in the subtitle
@negativePath: only authorized user can proceed to checkout



Execution instructions
After cloning the project please follow the below instructions:
1. Open Terminal and make sure you are in the meta-weather-api-bdd folder by typing:
   cd ~/; cd $(find **/InterviewAdidas -type d -name InterviewAdidas)
2. Input following maven command to verify and generate report (failed build due to bug):
   mvn clean verify
3. If you want to run  all the tests:
   mvn clean verify -Dcucumber.filter.tags="@amazon"
4. If you want to run the tests that you wish please use the tag explanation above:
   mvn clean verify -Dcucumber.filter.tags="@wantedtag"
5. Finally, to open the report directly in default browser please run:
   open target/cucumber-html-reports/overview-features.html
Click run button (make sure Cukes Runner is specified as a runner source )

2021 July®

