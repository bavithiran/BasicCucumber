package actiondefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;

public class MainActionFlow {

	public WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	public WebElement UserNamePath;

	@FindBy(xpath = "//*[@id=\"submit-btn\"]")
	public WebElement Mc_Next;
	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement PasswordPath;
	@FindBy(xpath = "//*[@id=\"submit-btn\"]")
	public WebElement LoginPath;

	// String UserId = "Qa Login";
	// String Password = "Password6^";
	// String NewName = "IPL 2020: Mahendra Singh Dhoni And Chennai Super Kings to
	// Arrive in UAE Early For IPL 13";

	public void Launch_Browser() throws InterruptedException {
		String BaseUrl = "https://mc.s10.exacttarget.com/";
		System.out.println("Launching Started .......... ");
		// SS.sendMail();

		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver_test//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(BaseUrl);
		String title = driver.getTitle();
		TimeUnit.SECONDS.sleep(3);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(5);

		System.out.println("Title Of the Website " + title);

		TimeUnit.SECONDS.sleep(5);
		// driver.close();
		// System.out.println("Driver Closed");

	}

	public void Enter_UserName_and_Password(String UserName, String Password) throws InterruptedException {
		System.out.println("MainAction.Enter_Username_password.........");
		System.out.println("MainAction.UserName" + UserName);

		WebElement UN = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		UN.sendKeys(UserName);
		System.out.println("Entered UserName");

		WebElement UN_Next_Button = driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"));
		UN_Next_Button.click();
		TimeUnit.SECONDS.sleep(5);
		System.out.println("UserName Next button");

		// Enter Password
		WebElement PW = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		PW.sendKeys(Password);
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Password given Successfully");

		// Click Login
		WebElement Login_Button = driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"));
		Login_Button.click();
		System.out.println("Click Login button");
		TimeUnit.SECONDS.sleep(5);

	}

	public void Quit_Browser() {
		driver.close();
		System.out.println("Quitting the Browser............");
	}

}
