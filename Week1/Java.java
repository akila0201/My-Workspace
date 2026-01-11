package Week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Java {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();


	}

}
