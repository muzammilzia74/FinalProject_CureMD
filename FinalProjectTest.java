package ProjecFinal;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FinalProjectTest {
	 WebDriver driver;
	 FinalProject1 obj;
	@BeforeTest
	public void getUrl(){

		driver = new ChromeDriver();
		obj =new FinalProject1(driver);
		driver.get("http://release01.curemd.com/curemdy/datlogin.asp");	
		driver.manage().window().maximize();
		PropertyConfigurator.configure("log4j.properties");
	}
	@Test ( priority = 0)
	  public void LogIn() throws InterruptedException{
	    obj.LogIn();
	}
	@Test ( priority = 1)
	  public void AddPatient() throws InterruptedException{
	    obj.AddPatient() ;
	}
	@Test ( priority = 2)
	  public void CreateCase() throws InterruptedException{
	    obj.CreateCase();
	}
	@Test ( priority = 3)
	  public void CreateProviderNote() throws InterruptedException{
	    obj.CreateProviderNote();
	}
	@Test ( priority = 4)
	  public void AddDiagnosis() throws InterruptedException{
	    obj.AddDiagnosis();
	}
	@Test ( priority = 5)
	  public void AddProcedure() throws InterruptedException{
	    obj.AddProcedure();
	}
}
