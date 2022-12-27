package com.runner.in;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.in.BaseClassPrjct;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vvmvk\\eclipse-workspace\\CucumberNewProject\\src\\test\\java"
		+ "\\com\\script\\in\\script.feature", glue = "com.stepdef.in")

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = BaseClassPrjct.browserLaunch("chrome");
	}
}
