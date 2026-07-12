package com.nabiel.qa.api.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/api",
        glue = {
                "com.nabiel.qa.api.stepdefinitions"
        },
        plugin = {
                "pretty",
                "html:build/reports/api-report.html",
                "json:build/reports/api-report.json"
        },
        tags = "@api"
)
public class ApiRunner {
}