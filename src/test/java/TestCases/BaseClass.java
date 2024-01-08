package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass()
	@Parameters({"browser","url"})
	public void OpenApplication(String br,String url) {
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(br.equals("Edge")){
			driver=new EdgeDriver();
	    }
		driver.get(url);
		}

		@AfterClass()
		public void CloseApplication(){
			driver.close();
		}
	
}



