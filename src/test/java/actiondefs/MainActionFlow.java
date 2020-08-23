package actiondefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MainActionFlow {

	@FindBy(xpath = "//*[@id=\"username\"]")
	public WebElement UserNamePath;
	@FindBy(xpath = "//*[@id=\"submit-btn\"]")
	public WebElement Mc_Next;
	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement PasswordPath;
	@FindBy(xpath = "//*[@id=\"submit-btn\"]")
	public WebElement LoginPath;

	public WebDriver driver;

	String BaseUrl  = "https://mc.s10.exacttarget.com/";
	//String UserId   = "Qa Login";
	//String Password = "Password6^";
	String NewName = "IPL 2020: Mahendra Singh Dhoni And Chennai Super Kings to Arrive in UAE Early For IPL 13";

	public void Launch_Browser() throws InterruptedException {

		System.out.println("Launching Started .......... ");
		// SS.sendMail();

		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver_test//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(BaseUrl);
		String title = driver.getTitle();
		TimeUnit.SECONDS.sleep(3);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(5);

		System.out.println("Title Of the Website "+title);

		TimeUnit.SECONDS.sleep(5);
		//driver.close();
		//System.out.println("Driver Closed");

	}
	
	public void Enter_UserName_and_Password(String UserName , String Password) throws InterruptedException
	{
		System.out.println("MainAction.Enter_Username_password.........");
		System.out.println("MainAction.UserName"+UserName);
		
		UserNamePath.sendKeys(UserName);
		TimeUnit.SECONDS.sleep(1);
		
		Mc_Next.click();
		TimeUnit.SECONDS.sleep(5);
		
		PasswordPath.sendKeys(Password);
		TimeUnit.SECONDS.sleep(1);
		
		LoginPath.click();
		TimeUnit.SECONDS.sleep(8);
		
	}
	
	public void Quit_Browser()
	{
		driver.close();
		System.out.println("Quitting the Browser............");
	}

}
