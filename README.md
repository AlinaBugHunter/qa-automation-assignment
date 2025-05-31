# QA Automation Assignment

## Project Overview

This project is a simple Selenium-based automation script that performs the following:

- Logs into an e-commerce website using test credentials.
- Navigates to the "Your Orders" section through the "Customer Service" menu.

Designed for QA training and technical assignment demonstration.

## Technologies Used

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-F2C811?style=flat&logo=testng&logoColor=black)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=flat&logo=selenium&logoColor=white)
![Page Object Model](https://img.shields.io/badge/POM-007ACC?style=flat&logo=visual-studio-code&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=flat&logo=intellij-idea&logoColor=white)

- **Java** — Programming language used for writing tests.
- **Gradle** — Build automation tool used for managing project dependencies and running builds.
- **TestNG** — Testing framework used for organizing and running tests.
- **Selenium WebDriver** — Framework for automating web UI interactions.
- **Page Object Model (POM)** — Design pattern improving maintainability of UI tests.
- **IntelliJ IDEA** — IDE used for Java development.



## Configuration

1.  Before running the test, create a file named `login.properties` in the following directory: `src/test/resources/properties/login.properties`.

2.  Add your test data in the following format:
    ```properties
    url=https://example.com
    pathToUsersChrome=/path/to/your/chrome/profile
    email=your_email@example.com
    password=your_password
    ```

## How to Run

Follow these steps to get the automation running on your local machine:

### 1. Clone the repository
```
git clone [https://github.com/AlinaBugHunter/qa-automation-assignment.git](https://github.com/AlinaBugHunter/qa-automation-assignment.git)
cd qa-automation-assignment
```

### 2. Build the project
`./gradlew build`

### 3. Run the test
`./gradlew test`
