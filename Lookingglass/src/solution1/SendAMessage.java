package solution1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SendAMessage {

	public WebDriver driver;
	
	public void send() throws InterruptedException {
		
		this.driver = mainSolution.driver;
		
		//Contact us 
		Thread.sleep(2000);
		driver.findElement(By.id("contact-link")).click();
				
		//Contact us form
		new Select(driver.findElement(By.id("id_contact"))).selectByVisibleText("Customer service");
				
		//Email address
		driver.findElement(By.id("email")).sendKeys("sogno@illeggittimo.com");
				
		//Order reference
		driver.findElement(By.id("id_order")).sendKeys("7 dresses");
				
		//Message
		driver.findElement(By.id("message")).sendKeys("I'm purchasing seven dresses, can I've an extra 20% off. Grazie!!");
				
		//Send message
		driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span")).click();
				
		//Back Home button
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span")).click();
		
	}

}
