package testass.testcase;

import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Vharsha\\testass\\testcase\\src\\test\\java\\testass\\testcase\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[normalize-space(text())='Log in']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//label[normalize-space(text())='Email']/following::input)[1]").sendKeys("vharsha.bca24@gmail.com");
		Thread.sleep(3000);
		driver.findElementByXPath("(//label[normalize-space(text())='Password']/following::input)[1]").sendKeys("Sansha@1414");
		Thread.sleep(3000);
		driver.findElementByXPath("//button[normalize-space(text())='LOGIN']").click();
		Thread.sleep(3000);
		String s=driver.findElementByXPath("//a[normalize-space(text())='Sign out']").getText();
		System.out.println(s);
		driver.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vharsha\\testass\\testcase\\src\\test\\java\\testass\\testcase\\driver\\chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://letcode.in/");
		Thread.sleep(3000);
		driver1.manage().window().maximize();
		Thread.sleep(3000);
		driver1.findElementByXPath("//a[normalize-space(text())='Log in']").click();
		Thread.sleep(3000);
		driver1.findElementByXPath("(//label[normalize-space(text())='Email']/following::input)[1]").sendKeys("vharsha.bca24@l.com");
		Thread.sleep(3000);
		driver1.findElementByXPath("(//label[normalize-space(text())='Password']/following::input)[1]").sendKeys("nsha@1414");
		Thread.sleep(3000);
		driver1.findElementByXPath("//button[normalize-space(text())='LOGIN']").click();
		Thread.sleep(3000);
		String s1=driver1.findElementByXPath("//button[normalize-space(text())='LOGIN']").getText();
		System.out.println(s1);
		Thread.sleep(2000);
		driver1.close();

	}
}


