package TestRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags=" ",features= {"src/test/resources/Features"},

glue = "stepdfinitions", 
plugin = {"pretty", "html:target/htmlreport.html"}

)
public class tutorial_testRunner extends AbstractTestNGCucumberTests{
	

}
