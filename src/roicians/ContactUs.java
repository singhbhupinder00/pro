

package roicians;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactUs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://simartechnologies.com/004/Edu/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'menuzord-right\']/ul/li[6]/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("form_name")).sendKeys("Bhupinder Singh");
		Thread.sleep(2000);
		driver.findElement(By.id("form_email")).sendKeys("singh.bhupinder99@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("form_subject")).sendKeys("Enquiry");
		Thread.sleep(2000);
		driver.findElement(By.id("form_phone")).sendKeys("905200555");
		Thread.sleep(2000);
		driver.findElement(By.id("message")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'contact_form\']/div[4]/button[2]")).click();
	}

}
