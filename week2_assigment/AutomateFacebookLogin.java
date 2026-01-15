package week2_assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateFacebookLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("dummy");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		driver.findElement(By.id("password_step_input")).sendKeys("Test123@");
		
		WebElement element1 = driver.findElement(By.name("birthday_day"));
		Select option = new Select(element1);
		option.selectByValue("2");
		
		WebElement element2 = driver.findElement(By.id("month"));
		Select option1 = new Select(element2);
		option1.selectByContainsVisibleText("Jan");
		
		WebElement element3 = driver.findElement(By.id("year"));
		Select option2 = new Select(element3 );
		option2.selectByContainsVisibleText("2000");
		driver.findElement(By.name("sex")).click();
		driver.close();
	}

}
