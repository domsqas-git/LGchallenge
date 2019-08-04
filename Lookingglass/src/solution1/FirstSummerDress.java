package solution1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FirstSummerDress {
	
	public WebDriver driver;

	public void dress() throws InterruptedException  {
		
		this.driver = mainSolution.driver;
		
		@SuppressWarnings("unused")
		JavascriptExecutor driver1;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		 Actions action = new Actions(driver);
		 
		 WebElement we = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]"));
			action.moveToElement(we).build().perform();
			
			//Add to Cart 1st Dress
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
			
			//Continue Shopping
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
		
	}

}
