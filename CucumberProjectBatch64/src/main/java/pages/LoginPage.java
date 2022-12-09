package pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	WebDriver driver;

	public void openBrowser() throws IOException, InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:/SELENIUM/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(
				"https://auth.scotiaonline.scotiabank.com/online?oauth_key=l62qreZHNBI&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoibDYycXJlWkhOQkkiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1ODQ1NjQxMywiaWF0IjoxNjU4NDU1MjEzLCJqdGkiOiI1ZDZmZDYzNy0wMWY4LTQwMTctOGUxZC1iOTA2YjAyODI0ZWMiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.HfPtGh4RdIPURjLMnw9IvcUE6b10D9NXN0rQQv-Tgfi8TKtAyi_KM7Ho2Y8aIpPryG2xVUS3TNg5HwtAHHrVXsVh_U_-MjeKrEqGLvrTWZ9fT-QrlsCuvEBWUqm1n31BkVMNp10JK_Wv-vdySSJfEokXXJxtU7JrgMz63xX-0ufJN6Iv721CmEGTso0q7VivtVS8Uxmk8v-r1Iy472ah8WfkpQC-JnB-84mI0mUFLVv4ArcABCTo0gN-RGhAWjD57O6uuiSgOpBP2WR8HYAXu-yoTC5Q9SgRemZ4931A-ZIuNxBsk38ec5oCVimuoe7xl8OuKSbStv9gnvinUOw-Fw&preferred_environment=");
		
		driver.manage().window().maximize();
		
		// Read Browser value from properties file

		/*
		 * FileInputStream f = new
		 * FileInputStream("C:\\SELENIUM\\testing\\multiple.properties"); Properties
		 * prop = new Properties(); prop.load(f); String browser =
		 * prop.getProperty("browser");
		 * 
		 * if (browser.equals("Firefox")) { System.setProperty("webdriver.gecko.driver",
		 * "C:/SELENIUM/SeleniumJars/geckodriver.exe"); driver = new FirefoxDriver(); }
		 * else if (browser.equals("Chrome")) {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:/SELENIUM/SeleniumJars/chromedriver.exe"); driver = new ChromeDriver(); }
		 * else { System.setProperty("webdriver.safari.driver",
		 * "C:/SELENIUM/SeleniumJars/safaridriver.exe"); driver = new SafariDriver(); }
		 * 
		 * PageFactory.initElements(driver, this);
		 */

	}

	public String verifyTitle() {
		String actualTitle = driver.getTitle();
		return actualTitle;
	}

	public void credentials(String email, String password) {

		driver.findElement(By.id("usernameInput-input")).sendKeys(email);

		driver.findElement(By.name("password")).sendKeys(password);
	}

	public void loginButton() {

		driver.findElement(By.id("signIn")).click();
	}

	public String errormessage() {
	
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
		return actualErr;
	}

	public void closeBrowser() {
		driver.quit();
	}

}
