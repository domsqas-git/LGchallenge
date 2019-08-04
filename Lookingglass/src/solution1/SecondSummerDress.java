package solution1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondSummerDress {
	
	public WebDriver driver;

	public void summer() throws InterruptedException {
		
		this.driver = mainSolution.driver;
		
		//click and add 2nd dress to cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")).click();
		
		//Continue Shopping
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
		
	}

}
