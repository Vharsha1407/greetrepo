package com.testdemo.testingdemo;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
	mport org.openqa.selenium.chrome.ChromeDriver;

	public class AppTest {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Vharsha\\newtest\\src\\main\\java\\com\\newtest\\newtestdriver\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			Thread.sleep(3000);
			driver.get("https://www.tutorialspoint.com/market/index.asp");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.findElementByLinkText("LOGIN").click();
			Thread.sleep(3000);
	        driver.findElementByXPath("(//label[normalize-space(text())='E-mail address / Mobile number']/following::input)[1]").sendKeys("vharsha.bca24@gmail.com");
			Thread.sleep(3000);
	        driver.findElementByXPath("(//label[normalize-space(text())='Enter Password']/following::input)[1]").sendKeys("Sansha@1414");
	        Thread.sleep(3000);
	        driver.findElementByXPath("//button[normalize-space(text())='Sign In']").click();
	        Thread.sleep(3000);
	        String ans = driver.findElementByXPath("//button[normalize-space(text())='Buy Course']").getText();
	        System.out.println(ans);
	        driver.close();
		}
		

	}

}
