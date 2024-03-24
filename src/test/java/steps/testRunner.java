package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//1st we have to do 5 no line , 
@CucumberOptions(features="src/test/java/features",
glue="steps",
plugin = {"html:reports"},
tags= {"@Smoke"}

)

		
public class testRunner extends AbstractTestNGCucumberTests{

}
