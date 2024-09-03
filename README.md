# Project Name

This project contains an automated test scenario for a Login page using Selenium WebDriver, Cucumber and Junit. The scenario is written in Gherkin language in the Feature file. The steps in the scenario are implemented in the Steps file. Page Object Model is used to identify the web elements and perform actions on them.

## Files

- Feature file: `src/test/resources/features/LoginPage.feature`
- Step definitions: `src/test/java/com/projectname/steps/LoginPageSteps.java`
- Page Object Model: `src/main/java/com/projectname/pages/LoginPage.java`
- Test runner: `src/test/java/com/projectname/RunCucumberTest.java`
- Configuration: `pom.xml`

## How to run

1. Clone the repository.
2. Open the project in an IDE that supports Maven, like IntelliJ IDEA or Eclipse.
3. Run the `RunCucumberTest` class to execute the test.

## Notes

- You need to have the ChromeDriver executable in your system's PATH to run the test.
- The test will execute in a Chrome browser.
