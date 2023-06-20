package basecs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("http://127.0.0.1:5500/index.html");
	       
	       String theTitle = driver.getTitle();
	       
	       
	       

	       Thread.sleep(3000);
	       
	       driver.manage().window().maximize();
	       

	       List <WebElement> mylist = driver.findElements(By.tagName("option"));
	        for(int i = 0 ; i < mylist.size(); i++) {
	        	System.out.println (mylist.get(i).getText());
	        }
	}

}
