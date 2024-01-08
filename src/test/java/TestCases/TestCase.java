package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginPage;

public class TestCase extends BaseClass{
	
@Test()
	public void LoginTest() {
	LoginPage lp=new LoginPage(driver);
	
	lp.setusername();
	System.out.println("Username Entered");
	lp.setpassword();
	System.out.println("Password Entered");
	lp.ClickLoginBtn();
	System.out.println("Login clicked");

}
}
