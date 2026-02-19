package java_marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class TataCliq {
	


public static void main(String[] args) throws InterruptedException, IOException  {
	
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.tatacliq.com/");
	Actions act = new Actions(driver);
	WebElement element = driver.findElement(By.xpath("//div[text()='Brands']"));
	act.moveToElement(element).perform();
	WebElement element2 = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
	act.moveToElement(element2).perform();
	driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']")).click();
	WebElement element3 = driver.findElement(By.xpath("//select[contains(@class,'SelectBoxDesktop__hideSelect')]"));
	Select options = new Select(element3);
	options.selectByValue("isProductNew");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//option[text()='New Arrivals']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilCheckbox']")).click();
	Thread.sleep(3000);
	List<WebElement> watchPrice = driver.findElements(By.xpath("//h3[@class='ProductDescription__boldText']"));
	List<Integer> watchPrice2 = new ArrayList<>();
	for(int i=0;i<watchPrice.size();i++) {
		String totalPrice = watchPrice.get(i).getText().replaceAll("[^0-9]", "");
	
		if(!totalPrice.isEmpty()) {
		int FinalPrice = Integer.parseInt(totalPrice);
		watchPrice2.add(FinalPrice);
		}
	}
		System.out.println(watchPrice2);
	
		Integer priceResult = watchPrice2.get(0);
		
		System.out.println("first watch price"+priceResult);
   
	driver.findElement(By.xpath("//div[contains(@class,'ProductModule__dummyDiv')]")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> parent = new ArrayList<>(windowHandles);
	driver.switchTo().window(parent.get(1));
	WebElement element5 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']"));
	String firstProductPrice = element5.getText().replaceAll("[^0-9]", "");
	int firstFinal = Integer.parseInt(firstProductPrice);
    System.out.println("product page price:" +firstFinal);
     
    if(priceResult.equals(firstFinal ))
   
    {
		System.out.println("price match");
	}
	else {
		System.out.println("not match");
	}
	WebElement element4 = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
	act.scrollToElement(element4).perform();
	element4.click();
	
    WebElement cartText = driver.findElement(By.xpath("//span[contains(@class,'DesktopHeader__cartCount')]"));
	String printText = cartText.getText();
	System.out.println("No.of.items in cart:" +printText);
	driver.findElement(By.xpath("//div[contains(@class,'DesktopHeader__myBagShow')]")).click();
	//screenshot
	File source = driver.getScreenshotAs(OutputType.FILE);
    File destination= new File("./snap/tatacliqfashion.png");
	FileUtils.copyFile(source,destination);
	driver.quit();

	}
}
