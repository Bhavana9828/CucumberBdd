package assignment2_Goibibo;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature", glue="stepDefination",
               plugin= {"pretty", "html:target/cucumber-html-reports", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
            	        "json:target/cucumber-html-reports/cucumber.json","rerun:target/failed_scenarios.txt" })
public class TestCase {

}

