package org.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\project.feature",glue="org.stepdefinition2",
dryRun=true, plugin= {"pretty",
		"html:target\\report",
		"json:target\\report\\zalora.json",
		"junit:target\\report\\zalora1.xml" })
public class TestRunnerClass {

}
