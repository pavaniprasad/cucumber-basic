package com.techstack.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/techstack/features"} ,
//format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"}, 
glue= {"com.techstack.steps"})
public class TestRunner extends AbstractTestNGCucumberTests {


}
