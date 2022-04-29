package io.ghost.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
			"src/test/resources/features/create_page.feature"
		},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/login.json",
        "html:target/login-html"},
        glue = {"io.ghost.sites",
				"io.ghost.pages",
                "io.ghost.steps",
                "io.ghost.utils",
                "io.ghost.hooks"})


public class PagesRunner {}
