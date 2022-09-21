package Com.Flipkart.StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DD\\workspace\\Flipkart\\src\\test\\resources\\Features\\RedmiPurchase.feature",
				glue ="Com.Flipkart.StepDefinition",	
				monochrome=true,
				plugin="html:target",
				dryRun=false)
public class TestRunner 
{
	}
   