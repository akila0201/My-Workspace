package java_marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none s-breadcrumb-header-text']"));
        String bagCount = element.getText();
        System.out.println(bagCount);
        Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']/following-sibling::span[text()='Skybags']")).click();
		driver.findElement(By.xpath("//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']/following-sibling::span[text()='Gear']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		WebElement element2 = driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-secondary']"));
		String brandname = element2.getText();
		System.out.println(brandname );

		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
