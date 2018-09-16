package com.techstack.steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.techstack.Base.BaseUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {

	private BaseUtil base;

	public Hook(BaseUtil base) {
		this.base = base;
	}

	@Before
	public void initTest() {
		
		//initiate webDriver Dummy
		//base.stepinfo = "fireFoxDriver";
		
		System.setProperty("webdriver.chrome.driver","C:\\Development\\chromedriver.exe");
		base.driver = new ChromeDriver();
		
		System.out.println("Open the browser-> chrome ");

	}

	@After
	public void tearDownTest(Scenario scenario) {

		if (scenario.isFailed() == true) {
			// take a screen shot
			System.out.println(scenario.getName());
		}
		System.out.println("closing the website");
	}

}
