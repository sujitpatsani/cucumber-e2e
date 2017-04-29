package com.retail.util;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/featurefiles/test.feature"},
glue={"com.retail.stepdef"})

public class Runner {

}
