package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags= {"@TOTALBALANCE"},monochrome = true,dryRun=false, strict=true,features = "classpath:featuresone"
        ,glue="stepdefinations" )
 
public class Runner_Balance {
 
}

