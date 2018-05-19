package org.airsonic.test.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "classpath:features/",
        glue = "org.airsonic.test.cucumber_hooks.docker")
public class RunCukesTest {

}
