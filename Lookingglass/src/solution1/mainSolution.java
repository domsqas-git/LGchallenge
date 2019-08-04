package solution1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


@SuppressWarnings("unused")
public class mainSolution {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//1.Test case: User open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//1.Test case: User open Firefox Browser
		//System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		// driver = new FirefoxDriver();	
		
		driver.manage().window().maximize();
		
		//2.Test case: User navigate to url: http://automationpractice.com/index.php
		Navigate n = new Navigate();
		n.nav();
		
		//3.Test case: User navigate to "Dresses" page by clicking on "Dress Tab"
		ClickDressTab clidre = new ClickDressTab();
		clidre.tab();
		
		//4.Test case: User choose and add 1st dress to cart and then click on Continue Shopping to go back to Dresses page
		FirstSummerDress fisu = new FirstSummerDress();
		fisu.dress();
		
		//5.Test case: User choose another Dress and adds it to cart and then click on Continue Shopping to go back to Dresses page
		SecondSummerDress sesu = new SecondSummerDress();
		sesu.summer();
		
		//6.Test case: User click on "More" on 3rd Dress, once in the dress page click to expand the picture and brows some.
		//Will close the picture and add the dress to cart. Will move away by clicking on Continue shopping and back to 
		//Dresses page by clicking on "Dresses" on the path above picture
		ThirdSummerDress tisu = new ThirdSummerDress();
		tisu.third();
		
		//7.Test case: User type in search box for Printed Summer Dress and enter. Will go to Summer Dresses page where
		// few dresses are available. Will pick the 4th and to cart. Will go to cart click on the dress that was just added and 
		//will be taken back and perform change quantity to 3,choose a size and add to cart. Then will go back to Dresses page
		//by clicking on the "main" Dresses Tab
		FourthPrintedSumDress foup = new FourthPrintedSumDress();
		foup.printed();
		
		//8.Test case: User type "chiffon" in search box and click search button. Will click on the image and access to the
		//"chiffon" dress page. Change the color, send email to a friend (filling email address, friend name, but then will cancel)
		//Will add the 5th dress to cart, will go to shopping cart and delete an extra dress from cart
		FifthChiffonDress fici = new FifthChiffonDress();
		fici.chiffon();
		
		//9.Test case: User contact the company through the "contact us" link. User send a message with the order reference. 
		//Then go back to "home page" by clicking "Back Home" button
		SendAMessage seme = new SendAMessage();
		seme.send();
		
		//10.Test case: User sign up for an account. Will fill all of the info(note. I've have already register and it won't work 
		//with the same email. I'm providing the script all you need to do is change a letter on the email)
		//SignUpAccount siup = new SignUpAccount();
		//siup.account();
		
		//11.Test case: User will go to cart and check out, click back on Shopping cart to confirm "cost of individual" dress order and "cost of total order"
		//(just the first 3 items are available for validation. the other 3 won't work)
		CartShopCost caso = new CartShopCost();
		caso.cost();
		
		//12.Test case:User sign in and click on "forgot password". Will go back to Log in and type email/password. will click
		//on "Order history", and then click on the website "Logo" to return back to "home page" and "Sign out". 
		//Session will CLOSE 
		SignInOut sino = new SignInOut();
		sino.sign();
		
		
		//1.Test case: User open Firefox Browser
				System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
				 driver = new FirefoxDriver();	
				
				driver.manage().window().maximize();
				
				//2.Test case: User navigate to url: http://automationpractice.com/index.php
				Navigate n1 = new Navigate();
				n.nav();
				
				//3.Test case: User navigate to "Dresses" page by clicking on "Dress Tab"
				ClickDressTab clidre1 = new ClickDressTab();
				clidre.tab();
				
				//4.Test case: User choose and add 1st dress to cart and then click on Continue Shopping to go back to Dresses page
				FirstSummerDress fisu1 = new FirstSummerDress();
				fisu.dress();
				
				//5.Test case: User choose another Dress and adds it to cart and then click on Continue Shopping to go back to Dresses page
				SecondSummerDress sesu1 = new SecondSummerDress();
				sesu.summer();
				
				//6.Test case: User click on "More" on 3rd Dress, once in the dress page click to expand the picture and brows some.
				//Will close the picture and add the dress to cart. Will move away by clicking on Continue shopping and back to 
				//Dresses page by clicking on "Dresses" on the path above picture
				ThirdSummerDress tisu1 = new ThirdSummerDress();
				tisu.third();
				
				//7.Test case: User type in search box for Printed Summer Dress and enter. Will go to Summer Dresses page where
				// few dresses are available. Will pick the 4th and to cart. Will go to cart click on the dress that was just added and 
				//will be taken back and perform change quantity to 3,choose a size and add to cart. Then will go back to Dresses page
				//by clicking on the "main" Dresses Tab
				FourthPrintedSumDress foup1 = new FourthPrintedSumDress();
				foup.printed();
				
				//8.Test case: User type "chiffon" in search box and click search button. Will click on the image and access to the
				//"chiffon" dress page. Change the color, send email to a friend (filling email address, friend name, but then will cancel)
				//Will add the 5th dress to cart, will go to shopping cart and delete an extra dress from cart
				FifthChiffonDress fici1 = new FifthChiffonDress();
				fici.chiffon();
				
				//9.Test case: User contact the company through the "contact us" link. User send a message with the order reference. 
				//Then go back to "home page" by clicking "Back Home" button
				SendAMessage seme1 = new SendAMessage();
				seme.send();
				
				//10.Test case: User sign up for an account. Will fill all of the info(note. I've have already register and it won't work 
				//with the same email. I'm providing the script all you need to do is change a letter on the email)
				//SignUpAccount siup1 = new SignUpAccount();
				//siup.account();
				
				//11.Test case: User will go to cart and check out, click back on Shopping cart to confirm "cost of individual" dress order and "cost of total order"
				//(just the first 3 items are available for validation. the other 3 won't work)
				CartShopCost caso1 = new CartShopCost();
				caso.cost();
				
				//12.Test case:User sign in and click on "forgot password". Will go back to Log in and type email/password. will click
				//on "Order history", and then click on the website "Logo" to return back to "home page" and "Sign out". 
				//Session will CLOSE 
				SignInOut sino1 = new SignInOut();
				sino.sign();
		
		
		
		
	}
	
}