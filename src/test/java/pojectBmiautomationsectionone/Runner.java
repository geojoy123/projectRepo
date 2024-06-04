package pojectBmiautomationsectionone;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)

@CucumberOptions(features="src/test/java/pojectBmiautomationsectionone", glue= {"pojectBmiautomationsectionone", "loginvalidationorderplaced"},



plugin = {"pretty", "html:target/HtmlReportsautomation_ccucmber"}

)
public class Runner {

}
