package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{

	@Test(groups={"Sanity", "Master"})
	public void verify_Login() {
		
		try {
			logger.info("****** Starting of th Login ******");
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("Email"));
			lp.setPassword(p.getProperty("Password"));
			lp.clickLogin();

			logger.info("****** Verify Login Page ******");
			MyAccountPage map = new MyAccountPage(driver);
			boolean targetValue = map.isMyAccountPageExist();

			Assert.assertEquals(targetValue, true, "Login Failed");
			//Assert.assertTrue(targetValue);
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("****** Login Complete ******");
	}
}
