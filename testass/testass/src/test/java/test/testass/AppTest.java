package test.testass;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Vharsha\\testass\\testass\\src\\test\\java\\test\\testass\\driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.findElementByLinkText("https://www.google.com/");
		
		driver.findElementByLinkText("https://letcode.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		
		
	}
}

