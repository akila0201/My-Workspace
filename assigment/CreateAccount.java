package week2.assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akila");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("createLeadForm_lastName");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abc");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Syseng");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		}

}
