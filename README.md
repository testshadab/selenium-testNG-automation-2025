# Selenium TestNG Automation Framework

This is a Maven-based Selenium TestNG automation framework for the Luma eCommerce application. It follows the Page Object Model design pattern and integrates with Allure for reporting.
---

**Java version recommended: 17**

## Project Structure (Maven-based):  
**Luma (Project Name)**
- │
- ├── allure-report/
- ├── allure-results/
- ├── logs/
- ├── screenshots/
- │
- ├── src/main/java/org.example
- │ ├── base/BaseTest.java
- │ ├── config/ConfigReader
- │ ├── pages/LoginPageFactory.java
- │ ├── pages/LoginPageBy.java
- │ ├── retryanalyzer/AnnotationTransformer
- │ ├── retryanalyzer/RetryAnalyzer
- │ ├── utils/Constants
- │ ├── utils/ExcelUtils
- │ ├── utils/ExcelWriterUtils
- │ ├── utils/JavaScriptUtils
- │ └── utils/WaitUtils
- │
- ├── src/main/resources
- │ ├── config.properties
- │ ├── log4j2.xml
- │ ├── qa.properties
- │ └── TestData.xlsx
- │
- ├── src/test/java/org.example
- │ ├── testcases/AddToCartTest
- │ └── testcases/LoginWithByLocatorsTest
- │
- ├── pom.xml
- └── testng.xml

---

## Features

- Maven for project management
- TestNG for test orchestration
- Page Object Model (POM) implementation
- Allure Reporting
- Retry logic via RetryAnalyzer
- JavaScript utility functions
- Excel data reader and writer
- Centralized config using `.properties` files
- Log4j2 for logging
- Screenshot capture
- Cross-browser ready base setup

---

## How to Run
Run the below-mentioned command in the terminal:
---
mvn clean test

## Generate Allure Report
After running the tests, generate the Allure report using:
---
allure generate allure-results --clean -o allure-report

