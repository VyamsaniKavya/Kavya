package in.capgemini.amazon.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features=
"E:\\CapSeleniumAutomationTesting\\AmazonTestingAutomation\\src\\test\\resources\\feature\\amazonendtoend1.feature",
glue= {"in\\capgemini\\amazon\\stepdefinitions"},
format= {"progress", "json:target/cucumber-reports/CucumberTestReport.json"},
plugin= {"json:target/cucumber-reports/CucumberTestReport.json"},
monochrome=true,
dryRun=false)
public class HomePageRunner extends AbstractTestNGCucumberTests{

}
