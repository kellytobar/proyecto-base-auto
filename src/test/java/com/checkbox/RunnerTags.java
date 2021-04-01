package com.checkbox;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
@CucumberOptions (features = "src/test/resources/features/Checkboxes/Forms/Checkbox.feature", tags = "@CasoExitoso1")

public class RunnerTags {

}
