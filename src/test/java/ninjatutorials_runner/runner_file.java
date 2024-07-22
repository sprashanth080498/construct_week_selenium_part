package ninjatutorials_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/tutorials_ninja/ninja_tutorials.feature",glue="ninja_steps_package")
public class runner_file {
}
