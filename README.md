# Fake New Validator

Test Assignment for Chase UK SDET role

This repository contains one java project: Chase-Test

The repository is organized into below folders under the *test* folder:

* resources/features - BDD test feature files
* java/com/chase/framework - Selenium specific class files to make it easy to write tests
* java/com/chase/pageobjects - Page object classes specific to various websites
* java/com/chase/steps - BDD test implementations

There are 4 scenarios in the feature file.

* If all scenarios pass then it can be assumed that news is genuine
* If any of the scenarios fail then there might be chance that the news is not genuine

How To run 
1. With Runner Class : Just Run Runner Class all the feature scenario will get run 
![img_1.png](img_1.png)

2. With Feature File : if you want to run with any specific feature scenario then go to /resources/Feature/FakeNew.feature
and run
![img_2.png](img_2.png)

Note:
1. Chase-Test can be started by executing the below command:
*mvn clean test -Dtest=com.chase.Runner -Dbrowser=chrome*

2. If no browser value is passed, then defaults to Chrome browser

3. Please ensure that the browser specific WebDriver file is added to the PATH

Cucumber Report Will generate post test execution 

![img.png](img.png)

Report 
![img_3.png](img_3.png)