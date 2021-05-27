package com.sonic.oluomo.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
        glue = {"com.sonic.oluomo.stepDefinition"},
        format = {"pretty","html:target/site/cucumber-pretty"},
        tags = {"@login"}



)
public class TestRunner {
}
