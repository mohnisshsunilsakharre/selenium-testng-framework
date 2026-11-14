# 🧪 Selenium WebDriver + Java + TestNG Automation Framework

## 🚀 Overview

This project is a web UI test automation framework built using **Java, Selenium WebDriver, TestNG, and Maven**. It demonstrates automated login testing for the OrangeHRM demo application using the **Page Object Model (POM)** design pattern.

The framework includes browser setup and teardown, external configuration through a properties file, TestNG test execution, Extent HTML reporting, and screenshot capture on test failure.

## 🛠️ Tech Stack

- Java 21
- Selenium WebDriver
- TestNG
- Maven
- Extent Reports
- Apache Commons IO
- SLF4J / Log4j
- Page Object Model (POM)

## ✨ Key Features

- Automated OrangeHRM login validation
- Page Object Model with separate Login and Home page classes
- Reusable WebDriver setup and teardown
- Configurable browser, URL, and credentials through `config.properties`
- TestNG-based test execution
- Extent HTML report generation
- Screenshot capture when a test fails
- Maven command-line execution

## 📁 Project Structure

```text
src/
├── main/
│   ├── java/
│   │   ├── base/          # WebDriver base setup
│   │   ├── pages/         # Page Object classes
│   │   └── utilities/     # Config, reporting, screenshot utilities
│   └── resources/
│       └── config.properties
└── test/
    ├── java/
    │   ├── listeners/     # TestNG Extent Reports listener
    │   └── tests/         # TestNG test classes
    └── resources/
        └── testng.xml
```

## ▶️ Prerequisites

- JDK 21
- Maven
- Google Chrome
- An IDE such as Eclipse or IntelliJ IDEA (optional)

## ⚙️ Configuration

Update `src/main/resources/config.properties` with the target URL, browser, and valid test credentials. Do not commit real or sensitive credentials to a public repository.

## ▶️ How to Run

From the project root, execute:

```bash
mvn clean test
```

You can also run the TestNG suite from your IDE using the project's `testng.xml` configuration.

## 📊 Test Reports

After execution, open the generated Extent report:

```text
reports/ExtentReport.html
```

Failure screenshots are saved under the configured report output location.

## 🧪 Current Test Coverage

- Valid login flow
- Dashboard visibility after successful login

## 👨‍💻 Author

**Mohnissh(Naacchht)**

---
*This repository is an educational automation framework project. Update this README as additional tests and framework capabilities are implemented.*
