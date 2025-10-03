# BDD Cucumber Framework (Java + Selenium)

This repository contains a sample automation framework that I built using **Java, Selenium WebDriver, Cucumber (BDD)**, and **Maven**.  
The goal of this project is to demonstrate how BDD can be used for writing clear, business-readable test cases while keeping the framework scalable and maintainable.

---

## Tools & Technologies
- Java
- Selenium WebDriver
- Cucumber (BDD)
- JUnit/TestNG (can be integrated)
- Maven

---

## Project Layout
BDD-Cucumber-Framework/
│── src
│   ├── main
│   │   └── java       # Application code (if any)
│   └── test
│       └── java       # Step definitions, Hooks, Runners
│       └── resources  # Feature files
│
├── pom.xml            # Maven dependencies
├── README.md          # Project documentation
└── .gitignore

- **features/** → contains `.feature` files written in Gherkin.
- **pages/** → follows the Page Object Model for better reusability.
- **stepDefinition/** → step bindings between feature files and code.
- **runner/** → Cucumber test runners.
- **utility/** → shared methods and utilities.

---

## Sample Feature File
```gherkin
Feature: Navigation to application

  Scenario: Verify application loads with a valid URL
    Given the user opens the application with a valid URL
    When the user clicks the Enter button
    Then the application should load successfully

## How to Run the Tests
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/BDD-Cucumber-Framework.git
2. Navigate to Project folder:
    cd BDD-Cucumber-Framework
3. Run the tests using Maven:
    mvn test
```markdown
## Test Reports
- After execution, detailed HTML reports can be found at:  
  `target/cucumber-reports/index.html`