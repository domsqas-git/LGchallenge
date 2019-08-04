package solution1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpAccount {
	
	public WebDriver driver;

	public void account() throws InterruptedException {
	
	this.driver = mainSolution.driver;
	
			//Create account
			//Email
			driver.findElement(By.name("email_create")).sendKeys("king@lookinggood.org");
			
			//Create account button
			driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
			
			//Personal info
			//Title
			Thread.sleep(2000);
			driver.findElement(By.id("uniform-id_gender1")).click();
			
			//First
			driver.findElement(By.id("customer_firstname")).sendKeys("Hermes");
			
			//Last
			driver.findElement(By.id("customer_lastname")).sendKeys("Trismegistus");
			
			//Pass
			driver.findElement(By.name("passwd")).sendKeys("Tusei1");
			
			//DOB
			//Thread.sleep(2000);
			new Select(driver.findElement(By.xpath("days"))).selectByVisibleText("3");
			new Select(driver.findElement(By.id("months"))).selectByVisibleText("1");
			new Select(driver.findElement(By.id("years"))).selectByVisibleText("1900");	
			
			//Sign up for news letter
			Thread.sleep(2000);
			driver.findElement(By.id("newsletter")).click();
			
			//First
			driver.findElement(By.id("firstname")).sendKeys("Hermes");
			
			//Last
			driver.findElement(By.id("lastname")).sendKeys("Trismegistus");
			
			//address
			driver.findElement(By.id("address1")).sendKeys("12 Continent Ave");
			
			//City
			driver.findElement(By.id("city")).sendKeys("Earth");
			
			//State
			Thread.sleep(2000);
			new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Maryland");
			
			//Zip code
			driver.findElement(By.id("postcode")).sendKeys("12345");
			
			//Additional info
			driver.findElement(By.id("other")).sendKeys("All good");
			
			//Telephone
			driver.findElement(By.id("phone")).sendKeys("123-123-1234");
			
			//Alias Address
			driver.findElement(By.id("alias")).sendKeys("universe");
			
			//Click Register
			driver.findElement(By.id("submitAccount")).click();
			
		
	}

}
