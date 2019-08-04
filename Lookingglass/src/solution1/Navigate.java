package solution1;

import org.openqa.selenium.WebDriver;

public class Navigate {
	
	public WebDriver driver;

	public void nav() {
		
		this.driver = mainSolution.driver;
		
		driver.get("http://automationpractice.com/index.php");
		
	}

}
