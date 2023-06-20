package bt;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.Date;
import java.util.List;

public class Fox {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

		// System.setProperty("webdriver.edge.driver", "C:\\edge\\msedgedriver.exe");
		// WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5501/Qa-automation-7thmar/index.html");

		driver.manage().window().maximize();

		//Date currentDate = new Date();
	//	String theActualDate = currentDate.toString().replace(":", "-");

		//TakesScreenshot src = ((TakesScreenshot) driver); // to take the shot for the driver

		//File Src = src.getScreenshotAs(OutputType.FILE); // to make a file for the shots

		//File Dest = new File(".//pic/"+theActualDate+".png");

		//FileUtils.copyFile(Src, Dest);
		
		//driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
		
		
		List <WebElement> thestudents = driver.findElements(By.tagName("option")); //the list for the students
		int theTotalNumOfStudents = thestudents.size();

		  System.out.println(theTotalNumOfStudents + " the original num");
		
		
		int HowManyTimesToRemove =10;
		  System.out.println(HowManyTimesToRemove + " times to remove");

		
		for(int i = 0 ; i < HowManyTimesToRemove; i++) {                  // loop for delete 
		driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
		}
		
		
		List<WebElement> theStudentsAfterRemove = driver.findElements(By.tagName("option")); //the list after the delete
		
		int ActualNum = theStudentsAfterRemove.size();
		  System.out.println(ActualNum + " this is the new actual number");

		
		
		int expectedNum = theTotalNumOfStudents - HowManyTimesToRemove;
		  System.out.println(expectedNum + " this is the expected number");

		

		Assert.assertEquals(ActualNum, expectedNum);
		
		
	

}
}
