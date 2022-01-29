/**
 * Running the tests throughout the Appium Scenario
 *
 * Author: Arkaan Quanunga
 *
 * Date: 29/01/2022
 */

package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/java/Features"},
        glue={"src/test/java/stepdefinitions"},
        plugin={"pretty", "html:target/cucumber"},
        tags= "@appium"
)

public class RunTest {

}
