package solution1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ThirdSummerDress {
	
	public WebDriver driver;

	public void third() throws InterruptedException {
		
		this.driver = mainSolution.driver;
		
		Actions action = new Actions(driver);
		
		//3rd Dress
		 WebElement we1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]"));
		 action.moveToElement(we1).build().perform();
		
		//Click "More" on 3rd Dress
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]/div/div[2]/div[2]/a[2]/span")).click();
		
		//Expand picture
		Thread.sleep(2000);
		driver.findElement(By.id("bigpic")).click();
		
		//Brows other pictures
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a")).click();
		
		//Close picture
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a")).click();
		
		//Add to cart 3rd dress
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		
		//Continue Shopping
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
		
		//click Dresses on the "directory" above picture
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/a[3]")).click();
		
		
	}

}
