package tests;

import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {

	LoginPage lp = new LoginPage();

	DataFile dt = new DataFile();
	
	@BeforeMethod
	public void beforeMethod() throws IOException {

		lp.openBrowser();
		lp.openLoginPage();
	}

	@AfterMethod
	public void afterMethod() {

		lp.closeBrowser();
	}

	@Test(priority = 1)
	public void loginEmailWithSpecialChar() throws InterruptedException {

		lp.login(dt.emailWithSpclChar,dt.wrongPassword );
		Assert.assertEquals(lp.readEmailError(), dt.spclCharError);

	}

	@Test(priority = 2)
	public void loginWithEmptyEmailTest() throws InterruptedException {

		lp.login("", dt.wrongPassword);
		Assert.assertEquals(lp.readEmailError(), dt.emptyEmailError);
	}

	@Test(priority = 3)
	public void loginWithEmptyPasswordTest() throws InterruptedException {

		lp.login(dt.wrongEmail, "");
		Assert.assertEquals(lp.readPasswordError(), dt.emptyPasswordError);
	}

	@Test(priority = 4)
	public void wrongEmailAndPasswordTest() throws InterruptedException {

		lp.login(dt.wrongEmail, dt.wrongPassword);
		Assert.assertEquals(lp.readGlobalError(), dt.globalError);
	}

}
