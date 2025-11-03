package amazon_LoginFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_Functionality {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\India\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=7304045368459802758&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9185377&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		WebElement signIN_botton=driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));
		Actions action=new Actions(driver);
		action.moveToElement(signIN_botton).perform();
		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span")).click();
		WebElement mobileNo_input=driver.findElement(By.id("ap_email_login"));
		mobileNo_input.sendKeys("9701331462");
		WebElement mobileNo_submit=driver.findElement(By.className("a-button-input"));
		mobileNo_submit.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password' and @id='ap_password']")).sendKeys("Jirra@1994");
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
		WebElement title= driver.findElement(By.xpath("//span[contains(text(), 'Hello, Agnesh')]"));
		String Login_title=title.getText();
		if(Login_title.equals("Hello, Agnesh")) {
			System.out.println("The user is successfully login");
		}else {
			System.out.println("The user is not successfully login");
		}
		
		
		
		
		
		
		
		
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
