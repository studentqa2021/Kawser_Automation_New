package com.generic.testrun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.code.LoginFunction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunLoginFunction extends LoginFunction {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.get("http://automationpractice.com/index.php?");
		driver.navigate().to(url);

		driver.findElement(By.xpath("//*[@class = 'login']")).click();

		driver.findElement(By.xpath("//*[@id='email']")).click();

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(userName);

		driver.findElement(By.xpath("//*[@id='passwd']")).click();

		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(password);

		driver.findElement(By.xpath("//*[@name='SubmitLogin']")).click();

		// driver.close();
	}

}
