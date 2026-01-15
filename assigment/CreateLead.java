package week2.assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Account demo");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement element1 = driver.findElement(By.name("industryEnumId"));
		Select options = new Select(element1);
		options.selectByContainsVisibleText("Computer Software");
		
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select options1 = new Select(element2);
		options1.selectByContainsVisibleText("S-Corporation");
		
		WebElement element3 = driver.findElement(By.name("dataSourceId"));
		Select options2 = new Select(element3);
		options2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select options3 = new Select(element4);
		options3.selectByIndex(3);
		
		WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select options4 = new Select(element5);
		options4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}
}
