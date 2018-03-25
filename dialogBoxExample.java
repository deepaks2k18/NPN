
package selenium_locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class dialogBoxExample {

	@Test
	public void testApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/NPN/htmls/dialogs/alert.html");
		driver.findElement(By.id("feedback")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread thread = new Thread();
		thread.sleep(10000);
		alert.accept();

	}
}
