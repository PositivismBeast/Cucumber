package org.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.remote.ScreenshotException;

import com.base.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see Use For Operate the Before and After Class Operations
 */
public class HooksClass extends Baseclass {

	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see Use For Run The Before Class Operations
	 */
	@Before
	public void beforeClass() throws FileNotFoundException, IOException {

		getDriver(getPropertiesFileValue("browser"));
		enterUrl(getPropertiesFileValue("url"));
		maximizeWindow();
	}

	/**
	 * 
	 * @param scenario
	 * @see Use For Run The After Class Operations
	 */
	@After
	public void afterClass(Scenario scenario) {

		if (scenario.isFailed()) {
			scenario.attach(screenshot(), "image/png", "every after failed secnario");
		}

		quitWindow();
	}

}
