package com.amazon.testrun;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.code.OrangeHRMTestData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunLoginFunction extends OrangeHRMTestData {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@name='username']")).click();
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);

		driver.findElement(By.xpath("//*[@name='password']")).click();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);

		driver.findElement(By.xpath("//*[@type='submit']")).click();

		driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
		//log out
		driver.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();

		// driver.close();
	}

}
