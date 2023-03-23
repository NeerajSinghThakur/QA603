package com.chase;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Neeraj SIngh Thakur
 * Cucumber Test Runner class
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.chase.steps",
        plugin = { "pretty", "html:target/cucumber-reports.html" }
)
public class Runner {
}