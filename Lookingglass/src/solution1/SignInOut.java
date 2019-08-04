package solution1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInOut {

	public WebDriver driver;
	
	public void sign() throws InterruptedException {
		
		this.driver = mainSolution.driver;
		
		//Sign in
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		//Forgot Pass
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Back to Login
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span")).click();
		
		//Email
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("king@lookinggood.net");
		
		//Password
		driver.findElement(By.id("passwd")).sendKeys("Tusei1");
		
		//Click Sign in button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
		//Order History
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")).click();
		
		//Click Logo to return home
		driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).click();
		
		//Sign out
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
		
		//Close Chrome session
		driver.close();
	
		
	
		
		
	}

}
