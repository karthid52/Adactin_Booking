package com.Adactin.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\adactinfeature",

				glue="",
				monochrome = true,
				dryRun = false,
			publish=false,
			plugin = {"html:Report/Html_Report.html",
					"json:Report/Cucumber.json",
				//"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Report/Extent.html"
					})
					
		
		
public class Test_Runner {
	public static WebDriver driver;
		
	@BeforeClass
	public static void set_Up() {
		driver=Base_Class.getBrowser("chrome");
	}
	
	@AfterClass
	public static  void tear_Down() throws Throwable {
		Thread.sleep(5000);
		driver.close();
	}
	}
	
		
	
	
	

