package com.webautomation.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = {
"com.webautomation.steps"
})


// @CucumberOptions(features = { "src/test/resources/features/lupapesquisa_page.feature" }, glue = {
//         "com.webautomation.steps" })
public class WebTest {
}
