package actiondefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;

public class MainActionFlow {

	public WebDriver driver;
	public WebDriver driverForTesting;
	String testingUrl = "https://courses.ultimateqa.com/users/sign_in";

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	public WebElement UserNamePath;

	@FindBy(xpath = "//*[@id=\"submit-btn\"]")
	public WebElement Mc_Next;
	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement PasswordPath;
	@FindBy(xpath = "//*[@id=\"submit-btn\"]")
	public WebElement LoginPath;

	// https://courses.ultimateqa.com/users/sign_in

	By emailIDField = By.xpath("//*[@type=\"email\"]");
	By passwordField = By.xpath("//*[@type=\"password\"]");
	By signInButton = By.xpath("//*[@type=\"submit\"]");
	By accountName = By.xpath("//a[@data-toggle='dropdown']");

	// String UserId = "Qa Login";
	// String Password = "Password6^";
	// String NewName = "IPL 2020: Mahendra Singh Dhoni And Chennai Super Kings to
	// Arrive in UAE Early For IPL 13";

	public MainActionFlow() {
		//System.setProperty("webdriver.chrome.driver", "C://ChromeDriver_test//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driverForTesting = new ChromeDriver();
		this.driverForTesting.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void qaBrowserLaunch() throws InterruptedException {

		driverForTesting.get(testingUrl);
		String title = driverForTesting.getTitle();
		TimeUnit.SECONDS.sleep(3);
		driverForTesting.manage().window().maximize();
		TimeUnit.SECONDS.sleep(5);

		System.out.println("Title Of the Website " + title);

		TimeUnit.SECONDS.sleep(5);

	}

	public void qaEnterEmailID() {
		driverForTesting.findElement(emailIDField).clear();
		driverForTesting.findElement(emailIDField).sendKeys("bavithiranhardy14@gmail.com");

	}

	public void qaEnterPassword() {
		driverForTesting.findElement(passwordField).clear();
		driverForTesting.findElement(passwordField).sendKeys("Messi10!!");
	}

	public void qaClickSignInButton(){
		driverForTesting.findElement(signInButton).click();
	}

	public void qaVerifyAccountName(){
		System.out.println(driverForTesting.findElement(signInButton).getText());
		
	}

	public void Launch_Browser() throws InterruptedException {
		String BaseUrl = "https://mc.s10.exacttarget.com/";
		System.out.println("Launching Started .......... ");
		// SS.sendMail();

		//System.setProperty("webdriver.chrome.driver", "C://ChromeDriver_test//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
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

	public void BU_Arrow_Click() {
		WebElement ArrowClick = driver.findElement(By.xpath("//span[@class=\"arrow visible\"]"));
		ArrowClick.click();
	}

	public void ExactBu_Click(String BUName) {
		WebElement BuClick = driver.findElement(By.xpath("//li[@role=\"option\"]//div[text()='" + BUName + "']//.."));
		BuClick.click();
	}

	public void Wait_Custom(String Seconds) throws InterruptedException {
		int i = Integer.parseInt(Seconds);
		TimeUnit.SECONDS.sleep(i);
	}

	public void Main_JourneyBuilder() {
		WebElement MainJourneyIcon = driver.findElement(By.xpath("//span[@class=\"mc-app-name\"][text()=\"Journey\"]"));
		MainJourneyIcon.click();
	}

	public void JourneyBuilderListClick() {
		WebElement JourneyBuildClick = driver
				.findElement(By.xpath("//a[@title=\"Journey Builder\"]//span[text()=\"Journey Builder\"]"));
		JourneyBuildClick.click();

	}

	public void JourneySearch() {
		WebElement Search = driver.findElement(By.xpath("//*[@id=\"interactionList-search\"]/div[2]/input"));
		Search.sendKeys("October");
	}

}
