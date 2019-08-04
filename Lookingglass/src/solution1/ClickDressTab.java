package solution1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickDressTab {
	
	public WebDriver driver;

	public void tab() {
		
		this.driver = mainSolution.driver;
		
		//click dresses tab
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
	
		
	}

}
