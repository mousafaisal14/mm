package mah;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class B_b {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();

		
		
		String user_name ="standard_user";
		String pass = "secret_sauce";
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		

	//	String actuallTitle = driver.getTitle();
		//String expectedTitle ="Swag Labs";
		
		
		
		//Assert.assertEquals(actuallTitle,expectedTitle);
		//System.out.print(actuallTitle);
		
		
		
		List <WebElement> myButtons = driver.findElements(By.className("btn"));
		
		for(int i = 0; i< myButtons.size();i++) {
			myButtons.get(i).click();
		}
		
              String actualItemsExpected = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText();
		System.out.print(actualItemsExpected);
		//int actualItemsAdded = myButtons.size();
		
		//Assert.assertEquals(actualItemsAdded, expectedItesmsAdded);
		
	
		
		}
	





}
		
		

	


