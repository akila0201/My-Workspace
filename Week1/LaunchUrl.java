package Week1;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchUrl {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://platform.testleaf.com/#/");
        driver.manage().window().maximize();
        driver.close();
	}

}