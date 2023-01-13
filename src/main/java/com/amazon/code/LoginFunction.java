package com.amazon.code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@name='username']")).click();
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//*[@name='password']")).click();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

}
