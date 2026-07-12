# QA Automation Framework

Automation Testing Framework using Java, Selenium, RestAssured and Cucumber.

## Tech Stack

- Java 17
- Gradle
- Selenium
- Cucumber
- RestAssured
- JUnit 4
- WebDriverManager

---

## Project Structure

src/test/java

- api
    - requests
    - runners
    - stepdefinitions

- web
    - hooks
    - pages
    - runners
    - stepdefinitions

- utils

src/test/resources

- features
    - api
    - web

---

## Run All Tests

```bash
gradlew test
```

## Run Web Tests

```bash
gradlew webTest
```

## Run API Tests

```bash
gradlew apiTest
```

---

## Reports

HTML Report

```
build/reports/
```

JSON Report

```
build/reports/
```

---

## Author

Nabiel Prayoga Budiana