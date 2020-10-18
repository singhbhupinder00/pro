package roicians;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {

@FindBy(linkText = "Careers")
WebElement careersLink;

@FindBy(name = "first_name")
WebElement firstName;

@FindBy(name = "last_name")
WebElement lastname;

@FindBy(id = "email")
WebElement email;

@FindBy(name = "Phone")
WebElement phonenumber;

@FindBy(name = "gender")
WebElement gender;

@FindBy(name = "job_post")
WebElement jobpost;

@FindBy(name = "message")
WebElement message;

@FindBy(id = "file")
WebElement fileName;

// @FindBy(xpath= "//*[@id=\"file\"]")
// WebElement C:\\files\\Dummydoc.pdf;

@FindBy(css = "button.btn:nth-child(2)")
WebElement smt;

public void Services() throws InterruptedException {

	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");	
	WebDriver driver = new FirefoxDriver();
driver.get("https://simartechnologies.com/004/Edu/careers");
Thread.sleep(2000);
PageFactory.initElements(driver, this);
}

public void setUserDetails() {
firstName.sendKeys("Ganga");
lastname.sendKeys("Jag");
email.sendKeys("gangajag@yahoo.com");
phonenumber.sendKeys("4379724206");
gender.sendKeys("Female");
message.sendKeys("test message");
fileName.sendKeys("C:\\files\\Dummydoc.pdf");
smt.click();
}

public static void main(String[] args) throws InterruptedException {
CareerPage cp = new CareerPage();
cp.Services();
cp.setUserDetails();
}

}

