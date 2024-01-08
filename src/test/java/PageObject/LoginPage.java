package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	//Constructor creating
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	WebElement txtusername;
	@FindBy(id="password")
	WebElement txtpassword;
	@FindBy(id="login")  
	WebElement txtlogin;
	
	public void setusername() {
		txtusername.sendKeys("AnushaAmmu");
	}
	public void setpassword() {
		txtpassword.sendKeys("Anusha@4");
	}
	public void ClickLoginBtn() {
		txtlogin.click();
	}
	
	

}
