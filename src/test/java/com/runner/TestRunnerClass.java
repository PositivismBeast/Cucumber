package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.Baseclass;
import com.reports.Reporting;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see Runner Class Using For Run The All Classes
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags = "", plugin = { "pretty",
		"json:target\\output.json" }, stepNotifications = true, glue = "org.stepdefinition", snippets = SnippetType.CAMELCASE, monochrome = true, dryRun = false, features = "src\\test\\resources\\Features", publish = true)

public class TestRunnerClass extends Baseclass {

	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see Generate The JvmReports
	 */
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {

		Reporting.generateJvmReport(System.getProperty("user.dir") + getPropertiesFileValue("jsonpath"));

	}

}
