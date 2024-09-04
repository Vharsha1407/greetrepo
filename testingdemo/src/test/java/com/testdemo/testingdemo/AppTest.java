package com.testdemo.testingdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public void loginSuccess() throws InterruptedException {
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
		
	public void loginFailure() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Vharsha\\newtest\\src\\main\\java\\com\\newtest\\newtestdriver\\chromedriver.exe");
		ChromeDriver driver2=new ChromeDriver();
		Thread.sleep(3000);
		driver2.get("https://www.tutorialspoint.com/market/index.asp");
		Thread.sleep(3000);
		driver2.manage().window().maximize();
		driver2.findElementByLinkText("LOGIN").click();
		Thread.sleep(3000);
        driver2.findElementByXPath("(//label[normalize-space(text())='E-mail address / Mobile number']/following::input)[1]").sendKeys("vharshca24@gmail.com");
		Thread.sleep(3000);
        driver2.findElementByXPath("(//label[normalize-space(text())='Enter Password']/following::input)[1]").sendKeys("San1414");
        Thread.sleep(3000);
        driver2.findElementByXPath("//button[normalize-space(text())='Sign In']").click();
        Thread.sleep(3000);
        String ans2 = driver2.findElementByXPath("//button[normalize-space(text())='Buy Course']").getText();
        System.out.println(ans2);
        driver2.close();

		System.out.println("login failure test case");
	}
}
