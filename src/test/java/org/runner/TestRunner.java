package org.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\praba\\CucumberFlipkart\\src\\test\\resources",glue="org.stepdefnition",dryRun=false,strict=true,monochrome=true,tags={"@smoke"},plugin= {"pretty","html:target/cucumber-reports/cucmber.html","json:target/cucumber-reports/cucmber.json","junit:target/cucumber-reports/re.xml"})
public class TestRunner {
	
}
