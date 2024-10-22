package com.epam.paymentgateway.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/java/com/epam/paymentgateway/feature",
    glue = "com.epam.paymentgateway.stepdefinition"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}