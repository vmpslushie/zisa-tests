package com;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ivan Hu on 3/22/17.
 */
public class DemoTest {

	private static FirefoxDriver driver;

	@BeforeClass
	public static void openBrowser(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testWebsite(){
		driver.get("");
		driver.get("http://www.5balloons.info");
		Assert.assertEquals("5 Balloons – Web Related Stuff and more", driver.getTitle());
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}

	@AfterClass
	public static void closeBrowser(){
		driver.quit();
	}

}
